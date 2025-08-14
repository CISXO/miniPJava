package domain.orchestration.controller;

import domain.itinerary.controller.ItineraryController;
import domain.trip.controller.TripController;
import view.outputView.OutputView;

public class OrchestrationController {

    ItineraryController itineraryController = new ItineraryController();
    TripController tripController = new TripController();

    OutputView outputView = new OutputView();

    public void run() {
        process(this::task1_test);
        process(this::task2_test);
    }

    private void task1_test() {
        outputView.testPrintMessage();
    }

    private void task2_test() {

    }

    private void process(Runnable action) {
        try {
            action.run();
        } catch (IllegalArgumentException e) {
//            outputView.exception(e);
            action.run();
            throw e;
        }
    }
}
