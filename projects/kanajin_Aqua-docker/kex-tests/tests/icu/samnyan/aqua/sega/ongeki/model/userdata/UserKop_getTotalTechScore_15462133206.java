package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserKop_getTotalTechScore_15462133206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273535;

    public UserKop_getTotalTechScore_15462133206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273541 = new Long(-4136906775323730350L);
        term273535 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term273537 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term273539 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term273555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273570 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term273535, term273535.getClass(), "id", -730002490862139184L);
        setLongField(term273537, term273537.getClass(), "id", 3335675525712891071L);
        setLongField(term273539, term273539.getClass(), "id", 3482630997171130718L);
        setField(term273539, term273539.getClass(), "extId", term273541);
        setField(term273539, term273539.getClass(), "luid", "VHXyYylDte");
        setIntField(term273556, term273556.getClass(), "year", 2024);
        setShortField(term273556, term273556.getClass(), "month", (short) 12);
        setShortField(term273556, term273556.getClass(), "day", (short) 11);
        setField(term273555, term273555.getClass(), "date", term273556);
        setByteField(term273560, term273560.getClass(), "hour", (byte) 11);
        setByteField(term273560, term273560.getClass(), "minute", (byte) 16);
        setByteField(term273560, term273560.getClass(), "second", (byte) 31);
        setIntField(term273560, term273560.getClass(), "nano", 556735651);
        setField(term273555, term273555.getClass(), "time", term273560);
        setField(term273539, term273539.getClass(), "registerTime", term273555);
        setIntField(term273566, term273566.getClass(), "year", 2020);
        setShortField(term273566, term273566.getClass(), "month", (short) 3);
        setShortField(term273566, term273566.getClass(), "day", (short) 23);
        setField(term273565, term273565.getClass(), "date", term273566);
        setByteField(term273570, term273570.getClass(), "hour", (byte) 7);
        setByteField(term273570, term273570.getClass(), "minute", (byte) 43);
        setByteField(term273570, term273570.getClass(), "second", (byte) 28);
        setIntField(term273570, term273570.getClass(), "nano", 970445056);
        setField(term273565, term273565.getClass(), "time", term273570);
        setField(term273539, term273539.getClass(), "accessTime", term273565);
        setField(term273537, term273537.getClass(), "card", term273539);
        setField(term273537, term273537.getClass(), "userName", "HaapzCPUgv");
        setIntField(term273537, term273537.getClass(), "level", -908460509);
        setIntField(term273537, term273537.getClass(), "reincarnationNum", 1263655765);
        setLongField(term273537, term273537.getClass(), "exp", -8733510534715183550L);
        setLongField(term273537, term273537.getClass(), "point", -6442380849992605292L);
        setLongField(term273537, term273537.getClass(), "totalPoint", 4850537158694643641L);
        setIntField(term273537, term273537.getClass(), "playCount", 1819531350);
        setIntField(term273537, term273537.getClass(), "jewelCount", -1806268976);
        setIntField(term273537, term273537.getClass(), "totalJewelCount", -588625518);
        setIntField(term273537, term273537.getClass(), "medalCount", -1322012320);
        setIntField(term273537, term273537.getClass(), "playerRating", 354204124);
        setIntField(term273537, term273537.getClass(), "highestRating", -1384573133);
        setIntField(term273537, term273537.getClass(), "battlePoint", -702875576);
        setIntField(term273537, term273537.getClass(), "bestBattlePoint", 1945418003);
        setIntField(term273537, term273537.getClass(), "overDamageBattlePoint", 1499410902);
        setBooleanField(term273537, term273537.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term273537, term273537.getClass(), "nameplateId", 2137116320);
        setIntField(term273537, term273537.getClass(), "trophyId", 1142212038);
        setIntField(term273537, term273537.getClass(), "cardId", 1394128162);
        setIntField(term273537, term273537.getClass(), "characterId", 1403824778);
        setIntField(term273537, term273537.getClass(), "characterVoiceNo", 2082609623);
        setIntField(term273537, term273537.getClass(), "tabSetting", -2092405045);
        setIntField(term273537, term273537.getClass(), "tabSortSetting", 2082908703);
        setIntField(term273537, term273537.getClass(), "cardCategorySetting", -89943020);
        setIntField(term273537, term273537.getClass(), "cardSortSetting", 820771333);
        setIntField(term273537, term273537.getClass(), "rivalScoreCategorySetting", -1481597667);
        setIntField(term273537, term273537.getClass(), "playedTutorialBit", -1665378071);
        setIntField(term273537, term273537.getClass(), "firstTutorialCancelNum", -833699886);
        setLongField(term273537, term273537.getClass(), "sumTechHighScore", -827581536732109578L);
        setLongField(term273537, term273537.getClass(), "sumTechBasicHighScore", 4849643423571290170L);
        setLongField(term273537, term273537.getClass(), "sumTechAdvancedHighScore", 3937558159475230310L);
        setLongField(term273537, term273537.getClass(), "sumTechExpertHighScore", -8976583421723090988L);
        setLongField(term273537, term273537.getClass(), "sumTechMasterHighScore", 4802807409428979179L);
        setLongField(term273537, term273537.getClass(), "sumTechLunaticHighScore", 8418266337024797944L);
        setLongField(term273537, term273537.getClass(), "sumBattleHighScore", 8486924245894084275L);
        setLongField(term273537, term273537.getClass(), "sumBattleBasicHighScore", -7394461219278324716L);
        setLongField(term273537, term273537.getClass(), "sumBattleAdvancedHighScore", -5159531072034606758L);
        setLongField(term273537, term273537.getClass(), "sumBattleExpertHighScore", -1562170354566693504L);
        setLongField(term273537, term273537.getClass(), "sumBattleMasterHighScore", 1344110425049007724L);
        setLongField(term273537, term273537.getClass(), "sumBattleLunaticHighScore", 2798403934006039965L);
        setField(term273537, term273537.getClass(), "eventWatchedDate", "nWlqfMmBHs");
        setField(term273537, term273537.getClass(), "cmEventWatchedDate", "plSlQRdRVX");
        setField(term273537, term273537.getClass(), "firstGameId", "pFmGgCMqnF");
        setField(term273537, term273537.getClass(), "firstRomVersion", "ZjqqDMUmbj");
        setField(term273537, term273537.getClass(), "firstDataVersion", "VXlTBlNDUC");
        setField(term273537, term273537.getClass(), "firstPlayDate", "JrRvLrAvOe");
        setField(term273537, term273537.getClass(), "lastGameId", "PKoYIuVvCK");
        setField(term273537, term273537.getClass(), "lastRomVersion", "cwzXkcrDLR");
        setField(term273537, term273537.getClass(), "lastDataVersion", "PWbkTRRQhH");
        setField(term273537, term273537.getClass(), "compatibleCmVersion", "wAITmXtDRl");
        setField(term273537, term273537.getClass(), "lastPlayDate", "CftrpNyoIA");
        setIntField(term273537, term273537.getClass(), "lastPlaceId", -296237735);
        setField(term273537, term273537.getClass(), "lastPlaceName", "uPzBpshCha");
        setIntField(term273537, term273537.getClass(), "lastRegionId", -1696576632);
        setField(term273537, term273537.getClass(), "lastRegionName", "hEJfxgmgVV");
        setIntField(term273537, term273537.getClass(), "lastAllNetId", 1211788385);
        setField(term273537, term273537.getClass(), "lastClientId", "eVLVFZDIBz");
        setIntField(term273537, term273537.getClass(), "lastUsedDeckId", 225742337);
        setIntField(term273537, term273537.getClass(), "lastPlayMusicLevel", -380899882);
        setIntField(term273537, term273537.getClass(), "lastEmoneyBrand", 2126833191);
        setField(term273535, term273535.getClass(), "user", term273537);
        setField(term273535, term273535.getClass(), "authKey", "XMRXETuILP");
        setIntField(term273535, term273535.getClass(), "kopId", 605638244);
        setIntField(term273535, term273535.getClass(), "areaId", -1241984600);
        setIntField(term273535, term273535.getClass(), "totalTechScore", 630841707);
        setIntField(term273535, term273535.getClass(), "totalPlatinumScore", 1848879841);
        setField(term273535, term273535.getClass(), "techRecordDate", "DMmgjHjqVC");
        setBooleanField(term273535, term273535.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTechScore", argTypes, term273535, args);
    }

};


