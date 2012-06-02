#!/bin/sh
MCP=../
cp -r client/* $MCP/src/minecraft/
cp -r common/* $MCP/src/minecraft/
cp -r server/* $MCP/src/minecraft_server/
cp -r common/* $MCP/src/minecraft_server/
pushd $MCP
./recompile.sh
popd
