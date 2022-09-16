/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */
package com.magento.idea.magento2plugin.generation.php;

import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.platform.ProjectTemplate;
import com.intellij.platform.ProjectTemplatesFactory;
import com.jetbrains.php.config.generation.PhpEmptyTemplatesFactory;
import icons.PhpIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.Icon;

public class MagentoTemplatesFactory extends ProjectTemplatesFactory {
    public MagentoTemplatesFactory() {
    }

    @NotNull
    public String[] getGroups() {
        return new String[]{PhpEmptyTemplatesFactory.PHP_PROJECT_TEMPLATE_GROUP};
    }

    public Icon getGroupIcon(String group) {
        return PhpIcons.Php_icon;
    }

    @NotNull
    public ProjectTemplate[] createTemplates(@Nullable String group, WizardContext context) {
        return new ProjectTemplate[]{new MagentoModuleGenerator()};
    }
}
