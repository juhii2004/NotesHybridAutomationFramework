package api;

import io.restassured.response.Response;

public class NotesApi {

    ApiClient apiClient =
            new ApiClient();

    public Response getAllNotes(
            String token) {

        return apiClient.getRequest(
                ApiRoutes.BASE_URL
                        + ApiRoutes.NOTES,
                token);
    }

    public Response deleteNote(
            String noteId,
            String token) {

        return apiClient.deleteRequest(
                ApiRoutes.BASE_URL
                        + ApiRoutes.NOTES
                        + "/"
                        + noteId,
                token);
    }

    public void printAllNotes(
            String token) {

        try {

            Response response =
                    getAllNotes(token);

            System.out.println(
                    response.asPrettyString());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void validateNotesStatusCode(
            String token) {

        try {

            Response response =
                    getAllNotes(token);

            int statusCode =
                    response.statusCode();

            System.out.println(
                    "Status Code : "
                            + statusCode);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void validateResponseTime(
            String token) {

        try {

            Response response =
                    getAllNotes(token);

            long responseTime =
                    response.getTime();

            System.out.println(
                    "Response Time : "
                            + responseTime);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}