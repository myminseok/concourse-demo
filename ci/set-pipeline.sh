#!/bin/sh

 fly -t lite sp -p demo -c pipeline.yml -l ~/.ssh/credential.yml

