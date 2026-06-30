package icu.samnyan.aqua.sega.diva.controller;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.diva.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DivaController_init_13448178231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public DivaController_init_13448178231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.controller.DivaController");
        Class<?>[] argTypes = new Class<?>[39];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.handler.boot.GameInitHandler");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.handler.boot.AttendHandler");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.CardProcedureHandler");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.ChangeNameHandler");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.ChangePasswdHandler");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.InitPasswdHandler");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.RegistrationHandler");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerInfoHandler");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerDataHandler");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CmPlyInfoHandler");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.ContestInfoHandler");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CstmzItmCtlgHandler");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CstmzItmNgMdlListHandler");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.FestaInfoHandler");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.NgWordHandler");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.NvRankingHandler");
        argTypes[16] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PsRankingHandler");
        argTypes[17] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PstdHCtrlHandler");
        argTypes[18] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PstdItemNgLstHandler");
        argTypes[19] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvDefChrLstHandler");
        argTypes[20] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvListHandler");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvNgMdlLstHandler");
        argTypes[22] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.QstInfHandler");
        argTypes[23] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.RmtWpLstHandler");
        argTypes[24] = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.ShopCatalogHandler");
        argTypes[25] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.BuyCstmzItmHandler");
        argTypes[26] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.BuyModuleHandler");
        argTypes[27] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.GetPvPdHandler");
        argTypes[28] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.ShopExitHandler");
        argTypes[29] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.StageResultHandler");
        argTypes[30] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.StageStartHandler");
        argTypes[31] = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.StoreSsHandler");
        argTypes[32] = Class.forName("icu.samnyan.aqua.sega.diva.handler.operation.PingHandler");
        argTypes[33] = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.EndHandler");
        argTypes[34] = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.PdUnlockHandler");
        argTypes[35] = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.PreStartHandler");
        argTypes[36] = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.SpendCreditHandler");
        argTypes[37] = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.StartHandler");
        argTypes[38] = Class.forName("icu.samnyan.aqua.sega.diva.util.DivaMapper");
        Object[] args = new Object[39];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = null;
        args[13] = null;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        args[22] = null;
        args[23] = null;
        args[24] = null;
        args[25] = null;
        args[26] = null;
        args[27] = null;
        args[28] = null;
        args[29] = null;
        args[30] = null;
        args[31] = null;
        args[32] = null;
        args[33] = null;
        args[34] = null;
        args[35] = null;
        args[36] = null;
        args[37] = null;
        args[38] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


