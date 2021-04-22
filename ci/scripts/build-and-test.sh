#!/bin/bash

set -ex

pushd app-source

./gradlew build --no-daemon

popd