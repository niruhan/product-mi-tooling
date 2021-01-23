package org.wso2.ei.dashboard.streaming.integrator.rest.api;

import org.wso2.ei.dashboard.streaming.integrator.rest.model.ApiResponseMessage;
import org.wso2.ei.dashboard.streaming.integrator.rest.model.ApiResponseMessageWithCode;
import org.wso2.ei.dashboard.streaming.integrator.rest.model.SiddhiAppContent;
import org.wso2.ei.dashboard.streaming.integrator.rest.model.SiddhiAppRevision;
import org.wso2.ei.dashboard.streaming.integrator.rest.model.SiddhiAppStatus;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.validation.Valid;

@Path("/siddhi-apps")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen",
        date = "2021-01-21T13:30:28.278+05:30[Asia/Colombo]")
/**
 * This is an auto-generated class containing REST API of Streaming Integrator
 */
public class SiddhiAppsApi {

    @POST
    @Path("/{appName}/backup")
    @Produces({ "application/json" })
    @Operation(summary = "Backs up the current state of a Siddhi App.", description = "Backs up the current state of " +
            "the specified Siddhi App. ", tags = { "state" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The state of the Siddhi App is successfully persisted.",
                content = @Content(schema = @Schema(implementation = SiddhiAppRevision.class))),
        @ApiResponse(responseCode = "404", description = "The Siddhi App specified is not found.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class))),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.", content = @Content(schema =
        @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsAppNameBackupPost(@PathParam("appName")

 @Parameter(description = "The name of the Siddhi App.") String appName
) {
        return Response.ok().entity("magic!").build();
    }
    @DELETE
    @Path("/{appName}")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes the Siddhi App.", description = "Removes the currently deployed Siddhi App with " +
            "the name specified. Path param of **appName** determines name of the Siddhi app. ", tags = { "artifact" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The Siddhi App is successfully deleted."),
        @ApiResponse(responseCode = "400", description = "The Siddhi App name provided is invalid.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class))),
        @ApiResponse(responseCode = "404", description = "The Siddhi App is not found.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class))),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsAppNameDelete(@PathParam("appName")

 @Parameter(description = "The name of the Siddhi App.") String appName
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{appName}")
    @Produces({ "application/json" })
    @Operation(summary = "Retrieves the specified Siddhi App.", description = "Retrieves the Siddhi App with the " +
            "specified name.", tags = { "artifact" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The Siddhi App is successfully retrieved.",
                content = @Content(schema = @Schema(implementation = SiddhiAppContent.class))),
        @ApiResponse(responseCode = "404", description = "The Siddhi App specified is not found.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsAppNameGet(@PathParam("appName")

 @Parameter(description = "The name of the Siddhi App.") String appName
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Path("/{appName}/restore")
    @Produces({ "application/json" })
    @Operation(summary = "Restores the state of a Siddhi App.", description = "Restores the state of the specified " +
            "Siddhi App. ", tags = { "state" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "The Siddhi App is successfully restored.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessage.class))),
        @ApiResponse(responseCode = "409", description = "The Siddhi App specified is not found.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class))),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsAppNameRestorePost(@PathParam("appName")

 @Parameter(description = "The name of the Siddhi App.") String appName
,  @QueryParam("revision")

 @Parameter(description = "The revision number of the backup.")  String revision
) {
        return Response.ok().entity("magic!").build();
    }
    @DELETE
    @Path("/{appName}/revisions")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes all revisions of the periodic state of a Siddhi Application.",
            description = "Deletes all revisions of the periodic state of the specified Siddhi Application. ",
            tags = { "State" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All revisions of the periodic state of the siddhi " +
                "application are deleted succussfully."),
        @ApiResponse(responseCode = "404", description = "The Siddhi Application is not found.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class))),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsAppNameRevisionsDelete(@PathParam("appName")

 @Parameter(description = "The name of the Siddhi Application.") String appName
,  @QueryParam("enabledRedeployment")

 @Parameter(description = "Whether the redeployment enable or not")  String enabledRedeployment
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{appName}/status")
    @Produces({ "application/json" })
    @Operation(summary = "Fetches the status of the Siddhi App.", description = "Fetches the status of the Siddhi " +
            "App. ", tags = { "artifact" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The state of the Siddhi App is successfully retrieved.",
                content = @Content(schema = @Schema(implementation = SiddhiAppStatus.class))),
        @ApiResponse(responseCode = "404", description = "The Siddhi App specified is not found.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsAppNameStatusGet(@PathParam("appName")

 @Parameter(description = "The name of the Siddhi App.") String appName
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Operation(summary = "Lists Siddhi Apps", description = "Provides the name list of Siddhi Apps that exist. ",
            tags = { "artifact" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The Siddhi Apps are successfully retrieved.")
    })
    public Response siddhiAppsGet(@QueryParam("isActive")

 @Parameter(description = "Retrieves only active/inactive Siddhi Apps as specified.")  Boolean isActive
) {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Consumes({ "text/plain" })
    @Operation(summary = "Saves the Siddhi App", description = "Saves the Siddhi App. Request \"**siddhiApp** " +
            "explains the Siddhi Query. ", tags = { "artifact" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "The Siddhi App is successfully validated and saved."),
        @ApiResponse(responseCode = "400", description = "A validation error occured."),
        @ApiResponse(responseCode = "409", description = "A Siddhi App with the given name already exists."),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.")
    })
    public Response siddhiAppsPost(@Valid String body) {
        return Response.ok().entity("magic!").build();
    }
    @PUT
    @Consumes({ "text/plain" })
    @Produces({ "application/json" })
    @Operation(summary = "Updates the Siddhi App.", description = "Updates the Siddhi App. Request \"**siddhiApp** " +
            "explains the Siddhi Query. ", tags = { "artifact" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The Siddhi App is successfully validated and updated."),
        @ApiResponse(responseCode = "201", description = "The Siddhi App is successfully validated and saved."),
        @ApiResponse(responseCode = "400", description = "A validation error occured.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class))),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsPut(@Valid String body) {
        return Response.ok().entity("magic!").build();
    }
    @DELETE
    @Path("/revisions")
    @Produces({ "application/json" })
    @Operation(summary = "Deletes all revisions of the periodic state of all Siddhi Applications.",
            description = "Deletes all revisions of the periodic state of all Siddhi Applications. ",
            tags = { "State" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All revisions of the periodic state of all the siddhi " +
                "applicationa are deleted succussfully."),
        @ApiResponse(responseCode = "500", description = "An unexpected error occured.",
                content = @Content(schema = @Schema(implementation = ApiResponseMessageWithCode.class)))
    })
    public Response siddhiAppsRevisionsDelete(@QueryParam("enabledRedeployment")

 @Parameter(description = "Whether the redeployment enable or not")  String enabledRedeployment
) {
        return Response.ok().entity("magic!").build();
    }}
