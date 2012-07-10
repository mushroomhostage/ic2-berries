#!/bin/sh
mkdir -p net/minecraft/server
cp *.class net/minecraft/server
cp ../mcmod.info .
zip -r Berries++-1.0a-mcpc1.2.5-r1.zip net/ mcmod.info

