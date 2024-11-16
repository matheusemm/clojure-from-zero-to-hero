#!/usr/bin/env bash -x

clj-kondo --lint "$(lein classpath)" --dependencies --parallel --copy-config
