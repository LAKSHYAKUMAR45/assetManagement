package com.assetmanagement.demo;

import com.assetmanagement.demo.democontroller.assetController;
import com.assetmanagement.demo.model.asset;
import com.assetmanagement.demo.service.assetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class assetControllerTest {

    @InjectMocks                        //Injecting Mocks in assetController class
    assetController assetController;

    @Mock                           //Mocking the assetService class
    assetService assetService;

    asset asset;

    //Setup function to run before each mock test
    @BeforeEach
    void setup() throws Exception {
        MockitoAnnotations.initMocks(this);

        asset = new asset();
        asset.setAssignedEmployeeId(253737);
        asset.setName("John Doe");
        asset.setPurchaseDate(new Date("31/12/1998"));
        asset.setConditionNotes("Used but in good condition");
        asset.setCategory("Laptop");
        asset.setAssignmentStatus("assigned");
    }

    //Test function to test getAsset

    @Test
    final void testGetAsset() {
        when(assetService.getAssetById(anyInt())).thenReturn(asset);

        asset asset = assetController.getAsset(253737);

        assertNotNull(asset);
        assertEquals(253737, asset.getAssignedEmployeeId());
        assertEquals("John Doe", asset.getName());
        assertEquals(new Date("31/12/1998"), asset.getPurchaseDate());
        assertEquals("Used but in good condition", asset.getConditionNotes());
        assertEquals("Laptop", asset.getCategory());
        assertEquals("assigned", asset.getAssignmentStatus());
    }

}
