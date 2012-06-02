#!/bin/sh -x
pushd ..
./reobfuscate.sh

pushd reobf/minecraft
zip -r ../../port-berries++/Berries++-1.0-client-r1.zip .
popd

pushd reobf/minecraft_server
zip -r ../../port-berries++/Berries++-1.0-server-r1.zip .
popd

popd
