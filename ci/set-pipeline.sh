#!/bin/sh

 fly -t lite sp -p concourse-demo -c pipeline.yml -l ~/.ssh/credential.yml

