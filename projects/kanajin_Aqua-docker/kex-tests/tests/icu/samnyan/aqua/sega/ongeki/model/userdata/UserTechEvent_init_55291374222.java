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
import java.lang.Boolean;

public class UserTechEvent_init_55291374222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361069;
     Object term361071;
     Object term361334;
     Object term361336;
     Object term361338;
     Object term361352;
     Object term361354;

    public UserTechEvent_init_55291374222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361069 = new Long(1163593795086493397L);
        Long term361075 = new Long(7269420277013840543L);
        term361071 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term361073 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term361089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term361090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term361094 = newInstance(Class.forName("java.time.LocalTime"));
        Object term361099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term361100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term361104 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term361071, term361071.getClass(), "id", -1254058907258429800L);
        setLongField(term361073, term361073.getClass(), "id", 629487086059435857L);
        setField(term361073, term361073.getClass(), "extId", term361075);
        setField(term361073, term361073.getClass(), "luid", "rsLKcDXyHN");
        setIntField(term361090, term361090.getClass(), "year", 2020);
        setShortField(term361090, term361090.getClass(), "month", (short) 12);
        setShortField(term361090, term361090.getClass(), "day", (short) 22);
        setField(term361089, term361089.getClass(), "date", term361090);
        setByteField(term361094, term361094.getClass(), "hour", (byte) 6);
        setByteField(term361094, term361094.getClass(), "minute", (byte) 46);
        setByteField(term361094, term361094.getClass(), "second", (byte) 40);
        setIntField(term361094, term361094.getClass(), "nano", 325486643);
        setField(term361089, term361089.getClass(), "time", term361094);
        setField(term361073, term361073.getClass(), "registerTime", term361089);
        setIntField(term361100, term361100.getClass(), "year", 2027);
        setShortField(term361100, term361100.getClass(), "month", (short) 8);
        setShortField(term361100, term361100.getClass(), "day", (short) 2);
        setField(term361099, term361099.getClass(), "date", term361100);
        setByteField(term361104, term361104.getClass(), "hour", (byte) 11);
        setByteField(term361104, term361104.getClass(), "minute", (byte) 54);
        setByteField(term361104, term361104.getClass(), "second", (byte) 44);
        setIntField(term361104, term361104.getClass(), "nano", 995449811);
        setField(term361099, term361099.getClass(), "time", term361104);
        setField(term361073, term361073.getClass(), "accessTime", term361099);
        setField(term361071, term361071.getClass(), "card", term361073);
        setField(term361071, term361071.getClass(), "userName", "fJvTqCbfMA");
        setIntField(term361071, term361071.getClass(), "level", 610878906);
        setIntField(term361071, term361071.getClass(), "reincarnationNum", -1746224611);
        setLongField(term361071, term361071.getClass(), "exp", 728948840193708528L);
        setLongField(term361071, term361071.getClass(), "point", 298052468520257534L);
        setLongField(term361071, term361071.getClass(), "totalPoint", -8556076191639250888L);
        setIntField(term361071, term361071.getClass(), "playCount", -981335375);
        setIntField(term361071, term361071.getClass(), "jewelCount", -1141494312);
        setIntField(term361071, term361071.getClass(), "totalJewelCount", 183050200);
        setIntField(term361071, term361071.getClass(), "medalCount", 639692322);
        setIntField(term361071, term361071.getClass(), "playerRating", 1457634579);
        setIntField(term361071, term361071.getClass(), "highestRating", -457843797);
        setIntField(term361071, term361071.getClass(), "battlePoint", 281949841);
        setIntField(term361071, term361071.getClass(), "bestBattlePoint", -603934938);
        setIntField(term361071, term361071.getClass(), "overDamageBattlePoint", -742314147);
        setBooleanField(term361071, term361071.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term361071, term361071.getClass(), "nameplateId", -1242738970);
        setIntField(term361071, term361071.getClass(), "trophyId", 127951690);
        setIntField(term361071, term361071.getClass(), "cardId", 373698256);
        setIntField(term361071, term361071.getClass(), "characterId", -633599574);
        setIntField(term361071, term361071.getClass(), "characterVoiceNo", 729082841);
        setIntField(term361071, term361071.getClass(), "tabSetting", -1061325707);
        setIntField(term361071, term361071.getClass(), "tabSortSetting", 1658923429);
        setIntField(term361071, term361071.getClass(), "cardCategorySetting", 1805247435);
        setIntField(term361071, term361071.getClass(), "cardSortSetting", 380481553);
        setIntField(term361071, term361071.getClass(), "rivalScoreCategorySetting", 304761842);
        setIntField(term361071, term361071.getClass(), "playedTutorialBit", 729591707);
        setIntField(term361071, term361071.getClass(), "firstTutorialCancelNum", -960259001);
        setLongField(term361071, term361071.getClass(), "sumTechHighScore", -944268818513325811L);
        setLongField(term361071, term361071.getClass(), "sumTechBasicHighScore", 1126144544859006565L);
        setLongField(term361071, term361071.getClass(), "sumTechAdvancedHighScore", -1352524185321528744L);
        setLongField(term361071, term361071.getClass(), "sumTechExpertHighScore", -425789009243239232L);
        setLongField(term361071, term361071.getClass(), "sumTechMasterHighScore", 3660384557117934538L);
        setLongField(term361071, term361071.getClass(), "sumTechLunaticHighScore", -2520781905105522707L);
        setLongField(term361071, term361071.getClass(), "sumBattleHighScore", 3978695969664624637L);
        setLongField(term361071, term361071.getClass(), "sumBattleBasicHighScore", -2453057388438893015L);
        setLongField(term361071, term361071.getClass(), "sumBattleAdvancedHighScore", 4728880403535129892L);
        setLongField(term361071, term361071.getClass(), "sumBattleExpertHighScore", -6231518997107845934L);
        setLongField(term361071, term361071.getClass(), "sumBattleMasterHighScore", -8844706288892942294L);
        setLongField(term361071, term361071.getClass(), "sumBattleLunaticHighScore", 962673749950286380L);
        setField(term361071, term361071.getClass(), "eventWatchedDate", "VmFcOFpPvD");
        setField(term361071, term361071.getClass(), "cmEventWatchedDate", "QwwEaswrvn");
        setField(term361071, term361071.getClass(), "firstGameId", "oQCoNtRjBj");
        setField(term361071, term361071.getClass(), "firstRomVersion", "vaClRBvfmO");
        setField(term361071, term361071.getClass(), "firstDataVersion", "EFNixrxvaP");
        setField(term361071, term361071.getClass(), "firstPlayDate", "pzapmOGACu");
        setField(term361071, term361071.getClass(), "lastGameId", "WuDEfkRXwg");
        setField(term361071, term361071.getClass(), "lastRomVersion", "hXWavoaOql");
        setField(term361071, term361071.getClass(), "lastDataVersion", "bosMmYJOnM");
        setField(term361071, term361071.getClass(), "compatibleCmVersion", "KFFAbKJkIZ");
        setField(term361071, term361071.getClass(), "lastPlayDate", "HsBwPvBQYq");
        setIntField(term361071, term361071.getClass(), "lastPlaceId", -1517797616);
        setField(term361071, term361071.getClass(), "lastPlaceName", "mbQVAHLnYZ");
        setIntField(term361071, term361071.getClass(), "lastRegionId", 2012020658);
        setField(term361071, term361071.getClass(), "lastRegionName", "gzXCSzfLRw");
        setIntField(term361071, term361071.getClass(), "lastAllNetId", -1318952469);
        setField(term361071, term361071.getClass(), "lastClientId", "STbIzhKYbc");
        setIntField(term361071, term361071.getClass(), "lastUsedDeckId", -1459543134);
        setIntField(term361071, term361071.getClass(), "lastPlayMusicLevel", -761035201);
        setIntField(term361071, term361071.getClass(), "lastEmoneyBrand", 357949597);
        term361334 = new Integer(1207122475);
        term361336 = new Integer(-1800259614);
        term361338 = new Integer(-803394525);
        term361352 = new Boolean(false);
        term361354 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term361069;
        args[1] = term361071;
        args[2] = term361334;
        args[3] = term361336;
        args[4] = term361338;
        args[5] = "GiNgzUhphY";
        args[6] = term361352;
        args[7] = term361354;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


