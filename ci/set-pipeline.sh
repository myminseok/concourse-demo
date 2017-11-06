#!/bin/sh

echo y | fly -t lite sp -p demo -c pipeline.yml -l credential.yml