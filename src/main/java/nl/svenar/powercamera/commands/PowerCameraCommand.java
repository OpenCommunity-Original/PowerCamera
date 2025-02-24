package nl.svenar.powercamera.commands;

import nl.svenar.powercamera.PowerCamera;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public abstract class PowerCameraCommand {

    protected PowerCamera plugin;
    private COMMAND_EXECUTOR ce = COMMAND_EXECUTOR.NONE;

    public PowerCameraCommand(PowerCamera plugin, String command_name, COMMAND_EXECUTOR ce) {
        MainCommand.add_powercamera_command(command_name, this);
        this.plugin = plugin;
        this.ce = ce;
    }

    public abstract boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args);

    public COMMAND_EXECUTOR getCommandExecutor() {
        return this.ce;
    }

    enum COMMAND_EXECUTOR {
        NONE,
        PLAYER,
        CONSOLE,
        ALL
    }
}
