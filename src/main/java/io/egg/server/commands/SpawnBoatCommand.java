package io.egg.server.commands;

import io.egg.server.entities.MonsterBoatCreature;
import net.minestom.server.command.builder.Command;
import net.minestom.server.entity.EntityCreature;
import net.minestom.server.entity.Player;

public class SpawnBoatCommand extends Command {
    public SpawnBoatCommand() {
        super("theboatcometh");
        setDefaultExecutor((sender, context) -> {
            sender.sendMessage("Mistakes were made");
            if (sender.isPlayer()) {
                Player p = (Player) sender;
                EntityCreature horror = new MonsterBoatCreature();
                horror.setInstance(p.getInstance(), p.getPosition());
                horror.setTarget(p);

            }
        });
    }
}
