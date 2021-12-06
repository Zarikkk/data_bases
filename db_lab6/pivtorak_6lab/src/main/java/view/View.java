package view;

import controller.*;
import model.*;


import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    private final BattaryController battaryController;
    private final CityController cityController;
    private final IntervalController intervalController;
    private final LocationController locationController;
    private final MeteostationController meteostationController;
    private final MeteostationInfoController meteostationInfoController;
    private final ProducerController producerController;
    private final ServiceInfoController serviceInfoController;
    private final WindInfoController windInfoController;

    private final Map<String, Printable> menu = new LinkedHashMap<>();

    public View(){
        battaryController = new BattaryController();
        cityController = new CityController();
        intervalController = new IntervalController();
        locationController = new LocationController();
        meteostationController = new MeteostationController();
        meteostationInfoController = new MeteostationInfoController();
        producerController = new ProducerController();
        serviceInfoController = new ServiceInfoController();
        windInfoController = new WindInfoController();

        menu.put("11", this::getAllBattaries);
        menu.put("12", this::getBattaryById);
        menu.put("13", this::createBattary);
        menu.put("14", this::updateBattary);
        menu.put("15", this::deleteBattary);

        menu.put("21", this::getAllCities);
        menu.put("22", this::getCityById);
        menu.put("23", this::createCity);
        menu.put("24", this::updateCity);
        menu.put("25", this::deleteCity);

        menu.put("31", this::getAllIntervals);
        menu.put("32", this::getIntervalById);
        menu.put("33", this::createInterval);
        menu.put("34", this::updateInterval);
        menu.put("35", this::deleteInterval);

        menu.put("41", this::getAllLocations);
        menu.put("42", this::getLocationById);
        menu.put("43", this::createLocation);
        menu.put("44", this::updateLocation);
        menu.put("45", this::deleteLocation);

        menu.put("51", this::getAllMeteostation);
        menu.put("52", this::getMeteostationById);
        menu.put("53", this::createMeteostation);
        menu.put("54", this::updateMeteostation);
        menu.put("55", this::deleteMeteostation);


        menu.put("61", this::getAllMeteostationInfos);
        menu.put("62", this::getMeteostationInfoById);
        menu.put("63", this::createMeteostationInfo);
        menu.put("64", this::updateMeteostationInfo);
        menu.put("65", this::deleteMeteostationInfo);

        menu.put("71", this::getAllProducers);
        menu.put("72",this::getProducerById);
        menu.put("73", this::createProducer);
        menu.put("74", this::updateProducer);
        menu.put("75", this::deleteProducer);

        menu.put("81", this::getAllServiceInfos);
        menu.put("82", this::getServiceInfosById);
        menu.put("83", this::createServiceInfos);
        menu.put("84", this::updateServiceInfos);
        menu.put("85", this::deleteServiceInfos);

        menu.put("91", this::getAllWindInfos);
        menu.put("92", this::getWindInfoById);
        menu.put("93", this::createWindInfos);
        menu.put("94", this::updateWindInfos);
        menu.put("95", this::deleteWindInfos);


    }





    public void displayMenu() {
        System.out.println("=======================================================================");
        System.out.println("                 Enter XY to choose the option, where:");
        System.out.println("=======================================================================");
        System.out.println("X - entity number:                 |       Y - CRUD number:");
        System.out.println("  1 - battary                      |         1 - GET ALL");
        System.out.println("  2 - city                         |         2 - GET ONE");
        System.out.println("  3 - interval                     |         3 - CREATE");
        System.out.println("  4 - location                     |         4 - UPDATE");
        System.out.println("  5 - meteostation                 |         5 - DELETE");
        System.out.println("  6 - meteostation info            |                     ");
        System.out.println("  7 - producers                    |                     ");
        System.out.println("  8 - service info                 |                     ");
        System.out.println("  9 - wind info                    |                     ");


        System.out.println("=======================================================================");
    }
    private void getAllWindInfos() {
        System.out.println("\n[WIND INFO / GET]");
        System.out.println(windInfoController.findAll() + "\n");
    }

    private void getWindInfoById() {
        System.out.println("\n [WIND INFO / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(windInfoController.findOne(id) + "\n");
    }
    private WindInfo getWindInfoInputs(){
        System.out.println("\n Enter description: ");
        String description = scanner.next();
        System.out.println("\n Enter speed: ");
        String speed = scanner.next();

        return new WindInfo(0, description, speed);
    }
    private void createWindInfos() {
        System.out.println("\n[WIND INFO / CREATE]");
        WindInfo windInfo = getWindInfoInputs();
        windInfoController.create(windInfo);
        System.out.println(" WIND INFO successfully created\n");
    }

    private void getAllServiceInfos(){
        System.out.println("\n[SERVICE INFO / GET]");
        System.out.println(serviceInfoController.findAll() + "\n");
    }
    private void getServiceInfosById(){
        System.out.println("\n [SERVICE INFO / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(serviceInfoController.findOne(id) + "\n");
    }

    private ServiceInfo getServiceInfoInputs(){
        System.out.println("\n Enter description: ");
        String description = scanner.next();
        System.out.println("\n Enter description: ");
        String date = scanner.next();

        return new ServiceInfo(0,description, date);
    }
    private void updateWindInfos(){
        System.out.println("\n[WIND INFO / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        WindInfo windInfo = getWindInfoInputs();
        windInfo.setId(id);
        windInfoController.update(windInfo.getId(), windInfo);

        System.out.println("WIND INFO with ID=" + id + " successfully updated");
    }
    private void createServiceInfos(){
        System.out.println("\n[SERVICE INFO / CREATE]");
        ServiceInfo serviceInfo = getServiceInfoInputs();
        serviceInfoController.create(serviceInfo);
        System.out.println("SERVICE INFO successfully created\n");
    }
    private void updateServiceInfos(){
        System.out.println("\n[SERVICE INFO / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        ServiceInfo serviceInfo = getServiceInfoInputs();
        serviceInfo.setId(id);
       serviceInfoController.update(serviceInfo.getId(), serviceInfo);

        System.out.println("SERVICE INFO with ID=" + id + " successfully updated");
    }
    private void deleteWindInfos(){
        System.out.println("[WIND INFO / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        windInfoController.delete(id);
        System.out.println("WIND INFO with ID=" + id + " successfully deleted");
    }
    private void deleteServiceInfos(){
        System.out.println("[SERVICE INFO / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        serviceInfoController.delete(id);
        System.out.println("SERVICE INFO with ID=" + id + " successfully deleted");
    }
    private void getAllProducers(){
        System.out.println("\n[PRODUCERS / GET]");
        System.out.println(producerController.findAll() + "\n");
    }
    private void getProducerById(){
        System.out.println("\n [PRODUCERS / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(producerController.findOne(id) + "\n");
    }
    private Producer getProducerInputs(){
        System.out.println("\n Enter name :");
        String name = scanner.next();
        System.out.println("\n Enter country :");
        String country = scanner.next();

        return new Producer(0,name,country);
    }

    private void createProducer(){
        System.out.println("\n[PRODUCER / CREATE]");
        Producer producer = getProducerInputs();
        producerController.create(producer);
        System.out.println("successfully created\n");
    }
    private void updateProducer(){
        System.out.println("\n[PRODUCER / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Producer producer = getProducerInputs();
        producer.setId(id);
        producerController.update(producer.getId(), producer);

        System.out.println("Item with ID=" + id + " successfully updated");
    }
    private void deleteProducer(){
        System.out.println("[PRODUCER / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        producerController.delete(id);
        System.out.println("Item with ID=" + id + " successfully deleted");
    }
    private void getAllMeteostationInfos(){
        System.out.println("\n[METEOSTATION INFO / GET]");
        System.out.println(meteostationInfoController.findAll() + "\n");
    }
    private void getMeteostationInfoById(){
        System.out.println("\n [METEOSTATION INFO / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(meteostationInfoController.findOne(id) + "\n");
    }
    private MeteostationInfo getMeteostationInfoInputs(){
        System.out.println("\n Enter temperature: ");
        String temperature = scanner.next();
        System.out.println("\n Enter humidity: ");
        String humidity = scanner.next();
        System.out.println("\n Enter wind id : ");
        Integer windId = scanner.nextInt();
        WindInfo windInfo = windInfoController.findOne(windId);
        System.out.println("\n Enter interval id : ");
        Integer intervalId = scanner.nextInt();
        Interval interval = intervalController.findOne(intervalId);
        System.out.println("\n Enter meteostation id : ");
        Integer meteostationId = scanner.nextInt();
        Meteostation meteostation = meteostationController.findOne(meteostationId);
        System.out.println("\n Enter service id : ");
        Integer serviceId = scanner.nextInt();
        ServiceInfo serviceInfo = serviceInfoController.findOne(serviceId);
        return new MeteostationInfo(0, temperature, humidity, windInfo, interval, meteostation, serviceInfo);
    }

    private void createMeteostationInfo(){
        System.out.println("\n[METEOSTATION INFO / CREATE]");
        MeteostationInfo meteostationInfo = getMeteostationInfoInputs();
        meteostationInfoController.create(meteostationInfo);
        System.out.println("Meteostation successfully created\n");
    }
    private void updateMeteostationInfo(){
        System.out.println("\n[ METEOSTATION INFO / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        MeteostationInfo meteostationInfo = getMeteostationInfoInputs();
        meteostationInfo.setId(id);
        meteostationInfoController.update(meteostationInfo.getId(), meteostationInfo);

        System.out.println("meteostation info with ID=" + id + " successfully updated");
    }
    private void deleteMeteostationInfo(){
        System.out.println("[METEOSTATION INFO / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        meteostationInfoController.delete(id);
        System.out.println("meteostation info with ID=" + id + " successfully deleted");
    }

    private void deleteMeteostation() {
        System.out.println("[METEOSTATION / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        meteostationController.delete(id);
        System.out.println("Item with ID=" + id + " successfully deleted");
    }

    private void updateMeteostation() {
        System.out.println("\n[METEOSTATION / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Meteostation meteostation = getMeteostationInputs();
        meteostation.setId(id);
        meteostationController.update(meteostation.getId(), meteostation);
    }


    private void createMeteostation() {
        System.out.println("\n[ METEOSTATION / CREATE]");
        Meteostation meteostation = getMeteostationInputs();
        meteostationController.create(meteostation);
        System.out.println("Successfully created");
    }


    private void getMeteostationById() {
        System.out.println("\n [  METEOSTATION / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(meteostationController.findOne(id) + "\n");
    }


    private void getAllMeteostation() {
        System.out.println("\n[ METEOSTATION  / GET]");
        System.out.println(meteostationController.findAll() + "\n");
    }

    private Meteostation getMeteostationInputs(){
        System.out.println("\n Enter name: ");
        String name = scanner.next();
        System.out.println("\n Enter installation date:");
        String installationDate = scanner.next();
        System.out.println("\n Enter location id:");
        Integer locationId = scanner.nextInt();
        Location location = locationController.findOne(locationId);
        System.out.println("\n Enter producer id:");
        Integer producerId = scanner.nextInt();
        Producer producer = producerController.findOne(producerId);
        System.out.println("\n Enter battary id:");
        Integer battaryId = scanner.nextInt();
        Battary battary = battaryController.findOne(battaryId);

        return new Meteostation(0,name, installationDate, location, producer, battary );

    }
    private void deleteLocation() {
        System.out.println("[CITY / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        locationController.delete(id);
        System.out.println("Item with ID=" + id + " successfully deleted");
    }

    private void updateLocation() {
        System.out.println("\n[LOCATION / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Location location = getLocationInputs();
        location.setId(id);
        locationController.update(location.getId(), location);
    }

    private void createLocation() {
        System.out.println("\n[ LOCATION / CREATE]");
        Location location = getLocationInputs();
        locationController.create(location);
        System.out.println("Successfully created");

    }
    private Location getLocationInputs(){
        System.out.println("\n Enter coordinates: ");
        String coordinates = scanner.next();
        System.out.println("\n Enter address:");
        String address = scanner.next();
        System.out.println("\n Enter city id:");
        Integer cityId = scanner.nextInt();
        City city = cityController.findOne(cityId);
        return new Location(0,coordinates, address, city);
    }
    private void getLocationById() {
        System.out.println("\n [ LOCATION / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(locationController.findOne(id) + "\n");
    }

    private void getAllLocations() {
        System.out.println("\n[ LOCATION  / GET]");
        System.out.println(locationController.findAll() + "\n");
    }

    private void deleteInterval() {
        System.out.println("[Interval / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        intervalController.delete(id);
        System.out.println("Item with ID=" + id + " successfully deleted");
    }

    private void updateInterval() {
        System.out.println("\n[INTERVAl / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Interval interval = getIntervalInputs();
        interval.setId(id);
        intervalController.update(interval.getId(), interval);
    }


    private void createInterval() {
        System.out.println("\n[INTERVAL / CREATE]");
        Interval interval = getIntervalInputs();
        intervalController.create(interval);
        System.out.println("Successfully created");

    }
    private Interval getIntervalInputs(){
        System.out.println("\n Enter interval date: ");
        String date = scanner.next();
        System.out.println("\n Enter time:");
        String time = scanner.next();

        return new Interval(0,date,time);

    }
    private void getIntervalById() {
        System.out.println("\n [ INTERVAL / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(intervalController.findOne(id) + "\n");
    }

    private void getAllIntervals() {
        System.out.println("\n[ INTERVALS  / GET]");
        System.out.println(intervalController.findAll() + "\n");
    }


    private void deleteCity() {
        System.out.println("[CITY / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        cityController.delete(id);
        System.out.println("Item with ID=" + id + " successfully deleted");
    }

    private void updateCity() {
        System.out.println("\n[BATTARY / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        City city = getCityInputs();
        city.setId(id);
        cityController.update(city.getId(), city);
    }

    private void createCity() {
        System.out.println("\n[CITY / CREATE]");
        City city = getCityInputs();
        cityController.create(city);
        System.out.println("Successfully created");
    }


    private City getCityInputs(){
        System.out.println("\n Enter city name: ");
        String name = scanner.next();

        return new City(0,name);
    }
    private void getCityById() {
        System.out.println("\n [CITY / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(cityController.findOne(id) + "\n");
    }

    private void getAllCities() {
        System.out.println("\n[ CITY  / GET]");
        System.out.println(cityController.findAll() + "\n");
    }

    private void deleteBattary() {
        System.out.println("[BATTARY / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        battaryController.delete(id);
        System.out.println("Item with ID=" + id + " successfully deleted");
    }

    private void updateBattary() {
        System.out.println("\n[BATTARY / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Battary battary = getBattaryInputs();
        battary.setId(id);
        battaryController.update(battary.getId(), battary);
    }

    private void createBattary() {
        System.out.println("\n[BATTARY / CREATE]");
        Battary battary = getBattaryInputs();
        battaryController.create(battary);
        System.out.println("Successfully created");
    }

    private Battary getBattaryInputs(){
        System.out.println("\n Enter battery capasity: ");
        String capasity = scanner.next();
        System.out.println("\n Enter producer id:");
        Integer producerId = scanner.nextInt();
        Producer producer = producerController.findOne(producerId);
        return new Battary(0,capasity,producer);
    }
    private void getBattaryById() {
        System.out.println("\n [BATTARY / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(battaryController.findOne(id) + "\n");
    }

    private void getAllBattaries() {
        System.out.println("\n[BATTARIES  / GET]");
        System.out.println(battaryController.findAll() + "\n");
    }

    public final void show() {
        String input;
        displayMenu();
        System.out.println("\nChoose action:\n");
        do {
            try {
                input = scanner.next();
                menu.get(input).print();
            } catch (Exception ignored) {
            }
        } while (scanner.hasNext());
    }
}
