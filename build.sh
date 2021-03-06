#!/bin/bash
set -e
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
mkdir -p $DIR/build
npm install
node_modules/gulp/bin/gulp.js webpack assets chat
sed -i "s/GA_TOKEN/$GA_TOKEN/g" dist/www/index.html
cd $DIR/dist
touch $DIR/build/frontend.zip
rm $DIR/build/frontend.zip
zip -r $DIR/build/frontend.zip *
cd $DIR
git show -s HEAD > $DIR/dist/version.txt