# Makefile

# コンパイルする対象
SOURCES = JavaElement/Java01/Car.java JavaElement/Java01/CarMain.java

# 出力先
OUTDIR = .

# コンパイルと実行
all:
		javac -d $(OUTDIR) $(SOURCES)
		java JavaElement.Java01.CarMain