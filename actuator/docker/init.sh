#!/bin/sh
rm -rf *

if [[ "`docker ps|grep 'image-demo'`" != "" ]];then
docker stop image-demo
fi

if [[ "`docker ps -a|grep 'image-demo'`" != "" ]];then
docker rm image-demo
fi


if [[ "`docker images|grep 'image-demo'`" != "" ]];then
docker stop image-demo
docker rmi image-demo
fi