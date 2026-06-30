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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserTradeItem_init_84281124016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157117;
     Object term157119;
     Object term157382;
     Object term157384;
     Object term157386;

    public UserTradeItem_init_84281124016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157117 = new Long(1471693542970291582L);
        Long term157123 = new Long(146749226579788091L);
        term157119 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term157121 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term157137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157142 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157152 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term157119, term157119.getClass(), "id", 2653767185543930605L);
        setLongField(term157121, term157121.getClass(), "id", -1090117923701476471L);
        setField(term157121, term157121.getClass(), "extId", term157123);
        setField(term157121, term157121.getClass(), "luid", "RqPlzjjWzi");
        setIntField(term157138, term157138.getClass(), "year", 2025);
        setShortField(term157138, term157138.getClass(), "month", (short) 2);
        setShortField(term157138, term157138.getClass(), "day", (short) 15);
        setField(term157137, term157137.getClass(), "date", term157138);
        setByteField(term157142, term157142.getClass(), "hour", (byte) 4);
        setByteField(term157142, term157142.getClass(), "minute", (byte) 17);
        setByteField(term157142, term157142.getClass(), "second", (byte) 28);
        setIntField(term157142, term157142.getClass(), "nano", 251651317);
        setField(term157137, term157137.getClass(), "time", term157142);
        setField(term157121, term157121.getClass(), "registerTime", term157137);
        setIntField(term157148, term157148.getClass(), "year", 2011);
        setShortField(term157148, term157148.getClass(), "month", (short) 7);
        setShortField(term157148, term157148.getClass(), "day", (short) 19);
        setField(term157147, term157147.getClass(), "date", term157148);
        setByteField(term157152, term157152.getClass(), "hour", (byte) 13);
        setByteField(term157152, term157152.getClass(), "minute", (byte) 52);
        setByteField(term157152, term157152.getClass(), "second", (byte) 13);
        setIntField(term157152, term157152.getClass(), "nano", 952032021);
        setField(term157147, term157147.getClass(), "time", term157152);
        setField(term157121, term157121.getClass(), "accessTime", term157147);
        setField(term157119, term157119.getClass(), "card", term157121);
        setField(term157119, term157119.getClass(), "userName", "rTGRmrdzoJ");
        setIntField(term157119, term157119.getClass(), "level", 169603914);
        setIntField(term157119, term157119.getClass(), "reincarnationNum", 827545300);
        setLongField(term157119, term157119.getClass(), "exp", -5216974957619259096L);
        setLongField(term157119, term157119.getClass(), "point", 4315564832122393204L);
        setLongField(term157119, term157119.getClass(), "totalPoint", -5903427622839064600L);
        setIntField(term157119, term157119.getClass(), "playCount", -111395552);
        setIntField(term157119, term157119.getClass(), "jewelCount", 997974718);
        setIntField(term157119, term157119.getClass(), "totalJewelCount", 2024272642);
        setIntField(term157119, term157119.getClass(), "medalCount", 879794397);
        setIntField(term157119, term157119.getClass(), "playerRating", -772320040);
        setIntField(term157119, term157119.getClass(), "highestRating", -1806851572);
        setIntField(term157119, term157119.getClass(), "battlePoint", 686629669);
        setIntField(term157119, term157119.getClass(), "bestBattlePoint", 1468334562);
        setIntField(term157119, term157119.getClass(), "overDamageBattlePoint", 1888899282);
        setBooleanField(term157119, term157119.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term157119, term157119.getClass(), "nameplateId", -766362556);
        setIntField(term157119, term157119.getClass(), "trophyId", 314054661);
        setIntField(term157119, term157119.getClass(), "cardId", 766314597);
        setIntField(term157119, term157119.getClass(), "characterId", -826100649);
        setIntField(term157119, term157119.getClass(), "characterVoiceNo", 213829504);
        setIntField(term157119, term157119.getClass(), "tabSetting", -1256059099);
        setIntField(term157119, term157119.getClass(), "tabSortSetting", -1820372279);
        setIntField(term157119, term157119.getClass(), "cardCategorySetting", 720068302);
        setIntField(term157119, term157119.getClass(), "cardSortSetting", 1790767972);
        setIntField(term157119, term157119.getClass(), "rivalScoreCategorySetting", 780675103);
        setIntField(term157119, term157119.getClass(), "playedTutorialBit", 714917997);
        setIntField(term157119, term157119.getClass(), "firstTutorialCancelNum", 713279805);
        setLongField(term157119, term157119.getClass(), "sumTechHighScore", 6871045899861495213L);
        setLongField(term157119, term157119.getClass(), "sumTechBasicHighScore", -6371020941640077376L);
        setLongField(term157119, term157119.getClass(), "sumTechAdvancedHighScore", -5357991031941140470L);
        setLongField(term157119, term157119.getClass(), "sumTechExpertHighScore", 4269975313283893844L);
        setLongField(term157119, term157119.getClass(), "sumTechMasterHighScore", 6469970772728526898L);
        setLongField(term157119, term157119.getClass(), "sumTechLunaticHighScore", 4165549581279829858L);
        setLongField(term157119, term157119.getClass(), "sumBattleHighScore", -6212921171477258438L);
        setLongField(term157119, term157119.getClass(), "sumBattleBasicHighScore", -6525339099981396474L);
        setLongField(term157119, term157119.getClass(), "sumBattleAdvancedHighScore", 8717114834059748754L);
        setLongField(term157119, term157119.getClass(), "sumBattleExpertHighScore", -1286664203066051015L);
        setLongField(term157119, term157119.getClass(), "sumBattleMasterHighScore", -6988326223564223966L);
        setLongField(term157119, term157119.getClass(), "sumBattleLunaticHighScore", 1481002182512184986L);
        setField(term157119, term157119.getClass(), "eventWatchedDate", "ZWjeJhPPnm");
        setField(term157119, term157119.getClass(), "cmEventWatchedDate", "yPIlHPlNib");
        setField(term157119, term157119.getClass(), "firstGameId", "qdtUDYxxKy");
        setField(term157119, term157119.getClass(), "firstRomVersion", "fSxuiDFwrP");
        setField(term157119, term157119.getClass(), "firstDataVersion", "kkVoDibEgl");
        setField(term157119, term157119.getClass(), "firstPlayDate", "PLwKYMwKMG");
        setField(term157119, term157119.getClass(), "lastGameId", "iNAPriOsZk");
        setField(term157119, term157119.getClass(), "lastRomVersion", "WIzLNHlHin");
        setField(term157119, term157119.getClass(), "lastDataVersion", "uXqaYisYbX");
        setField(term157119, term157119.getClass(), "compatibleCmVersion", "GoCyvRPeGu");
        setField(term157119, term157119.getClass(), "lastPlayDate", "qokvePyIUm");
        setIntField(term157119, term157119.getClass(), "lastPlaceId", -374549938);
        setField(term157119, term157119.getClass(), "lastPlaceName", "mdkCDAisEP");
        setIntField(term157119, term157119.getClass(), "lastRegionId", 1430439880);
        setField(term157119, term157119.getClass(), "lastRegionName", "KCXlVnMQNa");
        setIntField(term157119, term157119.getClass(), "lastAllNetId", 1074274300);
        setField(term157119, term157119.getClass(), "lastClientId", "itHxInHLQD");
        setIntField(term157119, term157119.getClass(), "lastUsedDeckId", -1533339633);
        setIntField(term157119, term157119.getClass(), "lastPlayMusicLevel", -1306689076);
        setIntField(term157119, term157119.getClass(), "lastEmoneyBrand", 801999249);
        term157382 = new Integer(406290178);
        term157384 = new Integer(1328284951);
        term157386 = new Integer(-490510770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term157117;
        args[1] = term157119;
        args[2] = term157382;
        args[3] = term157384;
        args[4] = term157386;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


