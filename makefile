# Makefile

# コンパイルする対象
# SOURCES = JavaElement/Java01/Car.java JavaElement/Java01/CarMain.java
# SOURCES = JavaElement/WebServer/SimpleWebServer.java
SOURCES = JavaElement/WebServer/getpost.java

# java JavaElement.Java01.CarMain
# java JavaElement.WebServer.SimpleWebServer

# 出力先
OUTDIR = .

# コンパイルと実行
all:
		javac -d $(OUTDIR) $(SOURCES)
		java JavaElement.WebServer.getpost