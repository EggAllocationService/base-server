package io.egg.server.commands;

import io.egg.server.games.BlockHuntGamemodeDelegate;
import io.egg.server.instances.InstanceManager;
import net.minestom.server.command.builder.Command;

import java.lang.reflect.InvocationTargetException;

public class CreateBlockhuntCommand extends Command {
    public CreateBlockhuntCommand() {
        super("blockhunt");
        setDefaultExecutor((sender, context) -> {
            BlockHuntGamemodeDelegate d = new BlockHuntGamemodeDelegate();
            try {
                InstanceManager.get().spawn("blockhunt", d);
                sender.sendMessage("Created blockhunt");
            } catch (NoSuchMethodException | InstantiationException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
