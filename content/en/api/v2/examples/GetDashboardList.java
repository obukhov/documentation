import com.datadog.api.v2.client.api.DashboardListsApi;

public class DashboardListsApiExample {

    public static void main(String[] args) {
        DashboardListsApi apiInstance = new DashboardListsApi();
        Long listId = 789; // Long | ID of the dashboard list to fetch
        try {
            DashboardList result = apiInstance.getDashboardList(listId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardListsApi#getDashboardList");
            e.printStackTrace();
        }
    }
}