This repository is a sample spring boot application to demonstrate micrometer metrics collection.<br>

<h4>Pre-requisites :<br>
1. Install influx-db on your machine (https://portal.influxdata.com/downloads/)<br>
2. Optional : Install grafana on your machine (https://grafana.com/get)<br>

<h4>Sample screen prints :<br>
1. To view data directly on influx<br>
Step 1 : go to installation folder and run `influx` This will open a CLI.<br>
Step 2 : Run `use my-influx-db`<br>
Step 3 : Run `select * from ttk`<br>

![Image of influx](https://github.com/sujeshs/spring-micrometer-demo/blob/develop/images/Influx.png)

2. To view data on actuator<br>
http://localhost:8080/actuator/metrics/ttk<br>

![Image of actuator](https://github.com/sujeshs/spring-micrometer-demo/blob/develop/images/Grafana.png)

3. To view on grafana<br>
Step 1 : add influxdb as a datasource<br>
Step 2 : write queries to plot the data<br>

![Image of grafana](https://github.com/sujeshs/spring-micrometer-demo/blob/develop/images/Actuator.png)