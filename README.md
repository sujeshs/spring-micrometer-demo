**This repository is a sample spring boot application to demonstrate micrometer metrics collection**

##Pre-requisites :
* Install influx-db on your machine (https://portal.influxdata.com/downloads/)
* Optional - Install grafana on your machine (https://grafana.com/get)

##Sample screen prints :
###To view data directly on influx
* go to installation folder and run `influx` This will open a CLI.<br>
* Run `use my-influx-db`<br>
* Run `select * from ttk`<br>
<br>
![Image of influx](https://github.com/sujeshs/spring-micrometer-demo/blob/develop/images/Influx.png)

###To view data on actuator
http://localhost:8080/actuator/metrics/ttk<br>
<br>
![Image of actuator](https://github.com/sujeshs/spring-micrometer-demo/blob/develop/images/Grafana.png)

###To view on grafana
* add influxdb as a datasource<br>
* write queries to plot the data<br>
<br>
![Image of grafana](https://github.com/sujeshs/spring-micrometer-demo/blob/develop/images/Actuator.png)