FROM icr.io/ibm-messaging/mq:9.2.4.0-r1

COPY mq-config.mqsc /etc/mqm/

ENV LICENSE=accept
ENV MQ_QMGR_NAME=QM1
ENV MQ_APP_PASSWORD=passw0rd

ENV PORT 1414
ENV PORT 9443
EXPOSE 1414 9443