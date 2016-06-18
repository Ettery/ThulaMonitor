#!/bin/bash
pid=`ps aux | grep thulamonitor | awk '{print $2}'`
sudo kill -9 $pid
