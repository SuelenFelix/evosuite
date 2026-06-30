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

public class UserEventMusic_setLevel_184389135516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376719;
     Object term377003;

    public UserEventMusic_setLevel_184389135516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term376725 = new Long(3610800451815944213L);
        term376719 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term376721 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term376723 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term376739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term376740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term376744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term376749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term376750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term376754 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term376719, term376719.getClass(), "id", 270930077667189860L);
        setLongField(term376721, term376721.getClass(), "id", 1228996871596559125L);
        setLongField(term376723, term376723.getClass(), "id", 3762477325352206635L);
        setField(term376723, term376723.getClass(), "extId", term376725);
        setField(term376723, term376723.getClass(), "luid", "QYXuwfWiLr");
        setIntField(term376740, term376740.getClass(), "year", 2029);
        setShortField(term376740, term376740.getClass(), "month", (short) 12);
        setShortField(term376740, term376740.getClass(), "day", (short) 14);
        setField(term376739, term376739.getClass(), "date", term376740);
        setByteField(term376744, term376744.getClass(), "hour", (byte) 14);
        setByteField(term376744, term376744.getClass(), "minute", (byte) 44);
        setByteField(term376744, term376744.getClass(), "second", (byte) 59);
        setIntField(term376744, term376744.getClass(), "nano", 415674618);
        setField(term376739, term376739.getClass(), "time", term376744);
        setField(term376723, term376723.getClass(), "registerTime", term376739);
        setIntField(term376750, term376750.getClass(), "year", 2023);
        setShortField(term376750, term376750.getClass(), "month", (short) 4);
        setShortField(term376750, term376750.getClass(), "day", (short) 13);
        setField(term376749, term376749.getClass(), "date", term376750);
        setByteField(term376754, term376754.getClass(), "hour", (byte) 2);
        setByteField(term376754, term376754.getClass(), "minute", (byte) 27);
        setByteField(term376754, term376754.getClass(), "second", (byte) 24);
        setIntField(term376754, term376754.getClass(), "nano", 490420615);
        setField(term376749, term376749.getClass(), "time", term376754);
        setField(term376723, term376723.getClass(), "accessTime", term376749);
        setField(term376721, term376721.getClass(), "card", term376723);
        setField(term376721, term376721.getClass(), "userName", "zxbwScKVek");
        setIntField(term376721, term376721.getClass(), "level", 601943126);
        setIntField(term376721, term376721.getClass(), "reincarnationNum", -835169173);
        setLongField(term376721, term376721.getClass(), "exp", 3187576311709836672L);
        setLongField(term376721, term376721.getClass(), "point", 8876701849709626986L);
        setLongField(term376721, term376721.getClass(), "totalPoint", 6279482317410671871L);
        setIntField(term376721, term376721.getClass(), "playCount", 290103455);
        setIntField(term376721, term376721.getClass(), "jewelCount", 1195811567);
        setIntField(term376721, term376721.getClass(), "totalJewelCount", -27327249);
        setIntField(term376721, term376721.getClass(), "medalCount", -1426279079);
        setIntField(term376721, term376721.getClass(), "playerRating", -1943627351);
        setIntField(term376721, term376721.getClass(), "highestRating", 515767271);
        setIntField(term376721, term376721.getClass(), "battlePoint", -1738856787);
        setIntField(term376721, term376721.getClass(), "bestBattlePoint", 1613718471);
        setIntField(term376721, term376721.getClass(), "overDamageBattlePoint", -2058157264);
        setBooleanField(term376721, term376721.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term376721, term376721.getClass(), "nameplateId", 644409299);
        setIntField(term376721, term376721.getClass(), "trophyId", -1065597049);
        setIntField(term376721, term376721.getClass(), "cardId", -1481804326);
        setIntField(term376721, term376721.getClass(), "characterId", 1256316882);
        setIntField(term376721, term376721.getClass(), "characterVoiceNo", -1108834621);
        setIntField(term376721, term376721.getClass(), "tabSetting", 2003247591);
        setIntField(term376721, term376721.getClass(), "tabSortSetting", -828427699);
        setIntField(term376721, term376721.getClass(), "cardCategorySetting", 1239369202);
        setIntField(term376721, term376721.getClass(), "cardSortSetting", -1435329726);
        setIntField(term376721, term376721.getClass(), "rivalScoreCategorySetting", 1376796830);
        setIntField(term376721, term376721.getClass(), "playedTutorialBit", -434872497);
        setIntField(term376721, term376721.getClass(), "firstTutorialCancelNum", -1578119477);
        setLongField(term376721, term376721.getClass(), "sumTechHighScore", 6779947763138978008L);
        setLongField(term376721, term376721.getClass(), "sumTechBasicHighScore", 3685418352706204340L);
        setLongField(term376721, term376721.getClass(), "sumTechAdvancedHighScore", 8296315759301002942L);
        setLongField(term376721, term376721.getClass(), "sumTechExpertHighScore", -1565532850953123014L);
        setLongField(term376721, term376721.getClass(), "sumTechMasterHighScore", 1654570276221310685L);
        setLongField(term376721, term376721.getClass(), "sumTechLunaticHighScore", -1333767468829556179L);
        setLongField(term376721, term376721.getClass(), "sumBattleHighScore", -6214934696806104690L);
        setLongField(term376721, term376721.getClass(), "sumBattleBasicHighScore", 7080062514347962862L);
        setLongField(term376721, term376721.getClass(), "sumBattleAdvancedHighScore", -463308599725432789L);
        setLongField(term376721, term376721.getClass(), "sumBattleExpertHighScore", 5355142816824783783L);
        setLongField(term376721, term376721.getClass(), "sumBattleMasterHighScore", -7647011724440543571L);
        setLongField(term376721, term376721.getClass(), "sumBattleLunaticHighScore", -1906805342315111540L);
        setField(term376721, term376721.getClass(), "eventWatchedDate", "ZyCkexIIwm");
        setField(term376721, term376721.getClass(), "cmEventWatchedDate", "YYiVhULvXY");
        setField(term376721, term376721.getClass(), "firstGameId", "NhRgTGFWmB");
        setField(term376721, term376721.getClass(), "firstRomVersion", "rOBKHPZFnU");
        setField(term376721, term376721.getClass(), "firstDataVersion", "IkFYovCTgb");
        setField(term376721, term376721.getClass(), "firstPlayDate", "RVIVmNguKP");
        setField(term376721, term376721.getClass(), "lastGameId", "fSUwhYHvGR");
        setField(term376721, term376721.getClass(), "lastRomVersion", "sAWmTYzZBk");
        setField(term376721, term376721.getClass(), "lastDataVersion", "tZvhNWcNUv");
        setField(term376721, term376721.getClass(), "compatibleCmVersion", "yDgSLJiiaz");
        setField(term376721, term376721.getClass(), "lastPlayDate", "bETkVMNpFg");
        setIntField(term376721, term376721.getClass(), "lastPlaceId", 126012894);
        setField(term376721, term376721.getClass(), "lastPlaceName", "XaUrnubYcD");
        setIntField(term376721, term376721.getClass(), "lastRegionId", -309438952);
        setField(term376721, term376721.getClass(), "lastRegionName", "omnqWgxBZi");
        setIntField(term376721, term376721.getClass(), "lastAllNetId", -1982063701);
        setField(term376721, term376721.getClass(), "lastClientId", "smLaLevijT");
        setIntField(term376721, term376721.getClass(), "lastUsedDeckId", 561930952);
        setIntField(term376721, term376721.getClass(), "lastPlayMusicLevel", 22947048);
        setIntField(term376721, term376721.getClass(), "lastEmoneyBrand", -681684272);
        setField(term376719, term376719.getClass(), "user", term376721);
        setIntField(term376719, term376719.getClass(), "eventId", 1017030185);
        setIntField(term376719, term376719.getClass(), "type", 772405009);
        setIntField(term376719, term376719.getClass(), "musicId", -1292913545);
        setIntField(term376719, term376719.getClass(), "level", 103673605);
        setIntField(term376719, term376719.getClass(), "techScoreMax", -675170508);
        setIntField(term376719, term376719.getClass(), "platinumScoreMax", 1813581929);
        setField(term376719, term376719.getClass(), "techRecordDate", "hvcODSZBXv");
        setBooleanField(term376719, term376719.getClass(), "isTechNewRecord", true);
        term377003 = new Integer(-479081805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term377003;
        callMethod(klass, "setLevel", argTypes, term376719, args);
    }

};


