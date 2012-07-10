#!/bin/sh -x
pushd ..
./reobfuscate.sh

rm -rf reobf/minecraft{,_server}/ic2

pushd reobf/minecraft
cp ../../port-berries++/mcmod.info .
cp ../../port-berries++/client/*.png .
zip -r ../../port-berries++/Berries++-1.0a-client-r1.zip .
popd

pushd reobf/minecraft_server
cp ../../port-berries++/mcmod.info .
zip -r ../../port-berries++/Berries++-1.0a-server-r1.zip .
popd

popd
