# CommentVampire
Will suck comments from youtube channels and put them into a mysql database :-)

This has no fancy data model nor does it follow DRY.
Just a tool to get hold of youtube comments.


## Prerequisite
- You will need a google api key which needs to be placed under src/main/resources/client_secrets.json
- When starting the comment vampire you will be asked to login into the google account that accesses the comments.
- The OAuth secret will be saved for future use.
- You need access to the haeqs_trolle database
- You need to place your Haeqs server credentials in src/main/resources/mysql_server.properties

