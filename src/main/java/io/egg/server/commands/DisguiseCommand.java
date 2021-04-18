package io.egg.server.commands;

import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;
import net.minestom.server.command.builder.arguments.ArgumentEnum;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.command.builder.condition.Conditions;
import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.Player;

public class DisguiseCommand extends Command {
    public DisguiseCommand() {
        super("disguise");
        setCondition(Conditions::playerOnly);
        setDefaultExecutor((sender, context) -> {
            sender.sendMessage("no");

        });
        var mode = ArgumentType.Enum("entity", EntityType.class)
                .setFormat(ArgumentEnum.Format.LOWER_CASED);
                
        //addSyntax(this::use, mode);
        
    }
    private void use(CommandSender sender, CommandContext context) {
        EntityType e = context.get("entity");
        ((Player) sender).switchEntityType(e);

    }
}
