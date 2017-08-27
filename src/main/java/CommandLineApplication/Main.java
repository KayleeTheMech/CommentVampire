package CommandLineApplication;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

    /**
     * Entry Point. Decides where to go from the given CLI options.
     * <p>
     * I know there is code duplication here, but why should a girl put brains into a very boring command line interface 🤷
     *
     * @param args
     */
    public static void main(String[] args) {
        OptionSet options = getOptionParser().parse(args);

        if (isHelpInOptions(options) || !isAnyOptionSet(options)) {
            // just print the help and terminate
            printHelp();
            return;
        }

        if (isVideoIdSet(options)) {
            // load video comments
            String videoId = getVideoIdFromOptions(options);
            processVideoId(videoId);
        }

        if (isChannelIdSet(options)) {
            // load all comments from all videos in channel
            String channelId = getChannelIdFromOptions(options);
            processChannelId(channelId);
        }
    }

    /**
     * Prints the help message.
     */
    private static void printHelp() {
        System.out.println("H-E-L-P");
    }

    /**
     * Starts procuring comments from Youtube for a given video id and uploads them to the haeqs database.
     *
     * @param videoId - the Id of the target video
     */
    private static void processVideoId(String videoId) {
        System.out.println("Called processVideoId with Id:" + videoId);
    }

    /**
     * Starts procuring comments from Youtube for a given channel and uploads them to the haeqs database
     */
    private static void processChannelId(String channelId) {
        System.out.println("Called processChannelId with Id:" + channelId);
    }

    /**
     * Prepares the options parser required to parse the arguments from the cli
     *
     * @return a prepared parser object
     */
    private static OptionParser getOptionParser() {
        OptionParser parser = new OptionParser();

        // All comments from one channel
        parser.accepts("c").withRequiredArg();
        parser.accepts("channelId").withRequiredArg(); // short: -cid

        // All comments from one video
        parser.accepts("v").withRequiredArg();
        parser.accepts("videoId").withRequiredArg(); // short: -vid

        // Print Help
        parser.accepts("h");
        parser.accepts("?");
        parser.accepts("help");

        return parser;
    }

    /**
     * Checks whether the given OptionSet contains the strings for help (?,h,help)
     *
     * @param options the parsed arguments
     * @return true if help was requested from the cli
     * false otherwise
     */
    private static boolean isHelpInOptions(OptionSet options) {
        return (options.has("?") || options.has("h") || options.has("help"));
    }

    /**
     * Checks whether the given OptionSet contains the strings for channel upload (c, channelId)
     *
     * @param options the parsed arguments
     * @return true if channel upload was requested from the cli
     * false otherwise
     */
    private static boolean isChannelIdSet(OptionSet options) {
        return (options.has("c") || options.has("channelId"));
    }

    /**
     * Checks whether the given OptionSet contains the strings for video upload (v, videoId)
     *
     * @param options the parsed arguments
     * @return true if video upload was requested from the cli
     * false otherwise
     */
    private static boolean isVideoIdSet(OptionSet options) {
        return (options.has("v") || options.has("videoId"));
    }

    /**
     * Obtains the video id from an optionset
     *
     * @param options
     * @return
     */
    private static String getVideoIdFromOptions(OptionSet options) {
        if (options.has("v")) {
            return (String) options.valueOf("v");
        } else if (options.has("videoId")) {
            return (String) options.valueOf("videoId");
        } else {
            throw new RuntimeException("Shouldn't call getVideoIdFromOptions without a given videoId argument.");
        }
    }

    /**
     * Obtains the channel id from an optionset
     *
     * @param options
     * @return
     */
    private static String getChannelIdFromOptions(OptionSet options) {
        if (options.has("c")) {
            return (String) options.valueOf("c");
        } else if (options.has("channelId")) {
            return (String) options.valueOf("channelId");
        } else {
            throw new RuntimeException("Shouldn't call getVideoIdFromOptions without a given videoId argument.");
        }
    }

    /**
     * @param options
     * @return
     */
    private static boolean isAnyOptionSet(OptionSet options) {
        return (isHelpInOptions(options) || isChannelIdSet(options) || isVideoIdSet(options));
    }

}
