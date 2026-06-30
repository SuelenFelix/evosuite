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
import java.lang.Integer;

public class UserBoss_setDamage_207642596610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138438;
     Object term138707;

    public UserBoss_setDamage_207642596610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138444 = new Long(1346299551708610248L);
        term138438 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term138440 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term138442 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138463 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138473 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138438, term138438.getClass(), "id", -8853273849024713509L);
        setLongField(term138440, term138440.getClass(), "id", -2380695779075859823L);
        setLongField(term138442, term138442.getClass(), "id", 332542919148720707L);
        setField(term138442, term138442.getClass(), "extId", term138444);
        setField(term138442, term138442.getClass(), "luid", "LWvhNNTPry");
        setIntField(term138459, term138459.getClass(), "year", 2017);
        setShortField(term138459, term138459.getClass(), "month", (short) 9);
        setShortField(term138459, term138459.getClass(), "day", (short) 20);
        setField(term138458, term138458.getClass(), "date", term138459);
        setByteField(term138463, term138463.getClass(), "hour", (byte) 7);
        setByteField(term138463, term138463.getClass(), "minute", (byte) 35);
        setByteField(term138463, term138463.getClass(), "second", (byte) 31);
        setIntField(term138463, term138463.getClass(), "nano", 62099803);
        setField(term138458, term138458.getClass(), "time", term138463);
        setField(term138442, term138442.getClass(), "registerTime", term138458);
        setIntField(term138469, term138469.getClass(), "year", 2025);
        setShortField(term138469, term138469.getClass(), "month", (short) 1);
        setShortField(term138469, term138469.getClass(), "day", (short) 8);
        setField(term138468, term138468.getClass(), "date", term138469);
        setByteField(term138473, term138473.getClass(), "hour", (byte) 19);
        setByteField(term138473, term138473.getClass(), "minute", (byte) 44);
        setByteField(term138473, term138473.getClass(), "second", (byte) 29);
        setIntField(term138473, term138473.getClass(), "nano", 541948713);
        setField(term138468, term138468.getClass(), "time", term138473);
        setField(term138442, term138442.getClass(), "accessTime", term138468);
        setField(term138440, term138440.getClass(), "card", term138442);
        setField(term138440, term138440.getClass(), "userName", "NKZtzKmNMG");
        setIntField(term138440, term138440.getClass(), "level", -884205561);
        setIntField(term138440, term138440.getClass(), "reincarnationNum", 1568826803);
        setLongField(term138440, term138440.getClass(), "exp", -4254277825971117635L);
        setLongField(term138440, term138440.getClass(), "point", -5142437405811498311L);
        setLongField(term138440, term138440.getClass(), "totalPoint", -1090898127496067997L);
        setIntField(term138440, term138440.getClass(), "playCount", 1283114550);
        setIntField(term138440, term138440.getClass(), "jewelCount", -64917079);
        setIntField(term138440, term138440.getClass(), "totalJewelCount", 14382041);
        setIntField(term138440, term138440.getClass(), "medalCount", -2016163798);
        setIntField(term138440, term138440.getClass(), "playerRating", 1260602495);
        setIntField(term138440, term138440.getClass(), "highestRating", 2098871750);
        setIntField(term138440, term138440.getClass(), "battlePoint", 583294548);
        setIntField(term138440, term138440.getClass(), "bestBattlePoint", -2034642375);
        setIntField(term138440, term138440.getClass(), "overDamageBattlePoint", -1486717740);
        setBooleanField(term138440, term138440.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term138440, term138440.getClass(), "nameplateId", 1578135347);
        setIntField(term138440, term138440.getClass(), "trophyId", -1283825868);
        setIntField(term138440, term138440.getClass(), "cardId", 322372633);
        setIntField(term138440, term138440.getClass(), "characterId", 1255794961);
        setIntField(term138440, term138440.getClass(), "characterVoiceNo", 232805435);
        setIntField(term138440, term138440.getClass(), "tabSetting", 721981536);
        setIntField(term138440, term138440.getClass(), "tabSortSetting", 91610201);
        setIntField(term138440, term138440.getClass(), "cardCategorySetting", -1281117768);
        setIntField(term138440, term138440.getClass(), "cardSortSetting", 208991599);
        setIntField(term138440, term138440.getClass(), "rivalScoreCategorySetting", 19147886);
        setIntField(term138440, term138440.getClass(), "playedTutorialBit", 610934293);
        setIntField(term138440, term138440.getClass(), "firstTutorialCancelNum", 285231640);
        setLongField(term138440, term138440.getClass(), "sumTechHighScore", 5793388968307772068L);
        setLongField(term138440, term138440.getClass(), "sumTechBasicHighScore", 3219327847825351575L);
        setLongField(term138440, term138440.getClass(), "sumTechAdvancedHighScore", 7149862438284127689L);
        setLongField(term138440, term138440.getClass(), "sumTechExpertHighScore", -8718363224871817670L);
        setLongField(term138440, term138440.getClass(), "sumTechMasterHighScore", 6152525931817882422L);
        setLongField(term138440, term138440.getClass(), "sumTechLunaticHighScore", 2293536094393567614L);
        setLongField(term138440, term138440.getClass(), "sumBattleHighScore", 6153327149150677857L);
        setLongField(term138440, term138440.getClass(), "sumBattleBasicHighScore", -9071491057399251543L);
        setLongField(term138440, term138440.getClass(), "sumBattleAdvancedHighScore", 6592662835796972687L);
        setLongField(term138440, term138440.getClass(), "sumBattleExpertHighScore", -8968353190513120488L);
        setLongField(term138440, term138440.getClass(), "sumBattleMasterHighScore", -3873208062497324678L);
        setLongField(term138440, term138440.getClass(), "sumBattleLunaticHighScore", -706064039460779130L);
        setField(term138440, term138440.getClass(), "eventWatchedDate", "bybEmXMboY");
        setField(term138440, term138440.getClass(), "cmEventWatchedDate", "mSHWVzcYng");
        setField(term138440, term138440.getClass(), "firstGameId", "JbyjPaAJuH");
        setField(term138440, term138440.getClass(), "firstRomVersion", "YxeVJOSiti");
        setField(term138440, term138440.getClass(), "firstDataVersion", "IuUPZzTzjB");
        setField(term138440, term138440.getClass(), "firstPlayDate", "YphZwwGqEI");
        setField(term138440, term138440.getClass(), "lastGameId", "SMpEesDFbN");
        setField(term138440, term138440.getClass(), "lastRomVersion", "Nmrdnhkhse");
        setField(term138440, term138440.getClass(), "lastDataVersion", "NUcoviagVt");
        setField(term138440, term138440.getClass(), "compatibleCmVersion", "LfJIjYgLRK");
        setField(term138440, term138440.getClass(), "lastPlayDate", "ctTLYxopUg");
        setIntField(term138440, term138440.getClass(), "lastPlaceId", 1143728385);
        setField(term138440, term138440.getClass(), "lastPlaceName", "tccghjUmdc");
        setIntField(term138440, term138440.getClass(), "lastRegionId", 368771436);
        setField(term138440, term138440.getClass(), "lastRegionName", "iCaFATAsAC");
        setIntField(term138440, term138440.getClass(), "lastAllNetId", 92522088);
        setField(term138440, term138440.getClass(), "lastClientId", "HPWJMPlVFI");
        setIntField(term138440, term138440.getClass(), "lastUsedDeckId", 704588458);
        setIntField(term138440, term138440.getClass(), "lastPlayMusicLevel", 1666352978);
        setIntField(term138440, term138440.getClass(), "lastEmoneyBrand", 439339997);
        setField(term138438, term138438.getClass(), "user", term138440);
        setIntField(term138438, term138438.getClass(), "musicId", 1821861150);
        setIntField(term138438, term138438.getClass(), "damage", -787591747);
        setBooleanField(term138438, term138438.getClass(), "isClear", true);
        setIntField(term138438, term138438.getClass(), "eventId", 426333384);
        term138707 = new Integer(-1659716094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term138707;
        callMethod(klass, "setDamage", argTypes, term138438, args);
    }

};


