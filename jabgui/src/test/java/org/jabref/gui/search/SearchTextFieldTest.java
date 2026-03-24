package org.jabref.gui.search;

import javafx.scene.Node;

import org.jabref.gui.icon.IconTheme;
import org.jabref.gui.keyboard.KeyBindingRepository;

import org.controlsfx.control.textfield.CustomTextField;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.testfx.framework.junit5.ApplicationExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ApplicationExtension.class)
class SearchTextFieldTest {

    @Test
    void createUsesRequestedIcon() {
        KeyBindingRepository keyBindingRepository = Mockito.mock(KeyBindingRepository.class);

        CustomTextField textField = SearchTextField.create(keyBindingRepository, IconTheme.JabRefIcons.FILTER);

        Node leftGraphic = textField.getLeft();
        assertEquals(IconTheme.JabRefIcons.FILTER.getGraphicNode().toString(), leftGraphic.toString());
        assertTrue(leftGraphic.getStyleClass().contains("search-field-icon"));
    }
}
