#!/bin/bash

set -ex

echo "My param: ${MY_PARAM}"

pushd app-source

./gradlew build --no-daemon

popd