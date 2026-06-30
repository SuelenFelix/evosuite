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

public class UserData_setFirstGameId_93052166106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66948;

    public UserData_setFirstGameId_93052166106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66952 = new Long(-8649738738252714180L);
        term66948 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term66950 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66981 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66948, term66948.getClass(), "id", -1446309878883127505L);
        setLongField(term66950, term66950.getClass(), "id", 3830478607830630886L);
        setField(term66950, term66950.getClass(), "extId", term66952);
        setField(term66950, term66950.getClass(), "luid", "QxSwOpnogl");
        setIntField(term66967, term66967.getClass(), "year", 2017);
        setShortField(term66967, term66967.getClass(), "month", (short) 1);
        setShortField(term66967, term66967.getClass(), "day", (short) 4);
        setField(term66966, term66966.getClass(), "date", term66967);
        setByteField(term66971, term66971.getClass(), "hour", (byte) 17);
        setByteField(term66971, term66971.getClass(), "minute", (byte) 39);
        setByteField(term66971, term66971.getClass(), "second", (byte) 5);
        setIntField(term66971, term66971.getClass(), "nano", 712424493);
        setField(term66966, term66966.getClass(), "time", term66971);
        setField(term66950, term66950.getClass(), "registerTime", term66966);
        setIntField(term66977, term66977.getClass(), "year", 2012);
        setShortField(term66977, term66977.getClass(), "month", (short) 1);
        setShortField(term66977, term66977.getClass(), "day", (short) 27);
        setField(term66976, term66976.getClass(), "date", term66977);
        setByteField(term66981, term66981.getClass(), "hour", (byte) 3);
        setByteField(term66981, term66981.getClass(), "minute", (byte) 30);
        setByteField(term66981, term66981.getClass(), "second", (byte) 25);
        setIntField(term66981, term66981.getClass(), "nano", 460782173);
        setField(term66976, term66976.getClass(), "time", term66981);
        setField(term66950, term66950.getClass(), "accessTime", term66976);
        setField(term66948, term66948.getClass(), "card", term66950);
        setField(term66948, term66948.getClass(), "userName", "wXeTrDfRqa");
        setIntField(term66948, term66948.getClass(), "level", 414965503);
        setIntField(term66948, term66948.getClass(), "reincarnationNum", -42540264);
        setLongField(term66948, term66948.getClass(), "exp", -2285322748002745702L);
        setLongField(term66948, term66948.getClass(), "point", 2173815786681385665L);
        setLongField(term66948, term66948.getClass(), "totalPoint", 6673648627982640630L);
        setIntField(term66948, term66948.getClass(), "playCount", -179532327);
        setIntField(term66948, term66948.getClass(), "jewelCount", 1282999015);
        setIntField(term66948, term66948.getClass(), "totalJewelCount", 1957459536);
        setIntField(term66948, term66948.getClass(), "medalCount", 1523266697);
        setIntField(term66948, term66948.getClass(), "playerRating", 487116383);
        setIntField(term66948, term66948.getClass(), "highestRating", 968755800);
        setIntField(term66948, term66948.getClass(), "battlePoint", 1491289140);
        setIntField(term66948, term66948.getClass(), "bestBattlePoint", 424804018);
        setIntField(term66948, term66948.getClass(), "overDamageBattlePoint", 835463182);
        setBooleanField(term66948, term66948.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term66948, term66948.getClass(), "nameplateId", -1730193267);
        setIntField(term66948, term66948.getClass(), "trophyId", 434941375);
        setIntField(term66948, term66948.getClass(), "cardId", 1467794711);
        setIntField(term66948, term66948.getClass(), "characterId", -491366166);
        setIntField(term66948, term66948.getClass(), "characterVoiceNo", 1410370567);
        setIntField(term66948, term66948.getClass(), "tabSetting", 2136820914);
        setIntField(term66948, term66948.getClass(), "tabSortSetting", -1698291583);
        setIntField(term66948, term66948.getClass(), "cardCategorySetting", -246710651);
        setIntField(term66948, term66948.getClass(), "cardSortSetting", -374626618);
        setIntField(term66948, term66948.getClass(), "rivalScoreCategorySetting", 1449690385);
        setIntField(term66948, term66948.getClass(), "playedTutorialBit", -1063098623);
        setIntField(term66948, term66948.getClass(), "firstTutorialCancelNum", 1519335351);
        setLongField(term66948, term66948.getClass(), "sumTechHighScore", -4710542328870024553L);
        setLongField(term66948, term66948.getClass(), "sumTechBasicHighScore", 711490618640696795L);
        setLongField(term66948, term66948.getClass(), "sumTechAdvancedHighScore", -8939684594399095164L);
        setLongField(term66948, term66948.getClass(), "sumTechExpertHighScore", -7748613109503374943L);
        setLongField(term66948, term66948.getClass(), "sumTechMasterHighScore", -8647371121395122436L);
        setLongField(term66948, term66948.getClass(), "sumTechLunaticHighScore", -7377577718146705627L);
        setLongField(term66948, term66948.getClass(), "sumBattleHighScore", -4742652737531811018L);
        setLongField(term66948, term66948.getClass(), "sumBattleBasicHighScore", 7714939142473649868L);
        setLongField(term66948, term66948.getClass(), "sumBattleAdvancedHighScore", -1207137470414072121L);
        setLongField(term66948, term66948.getClass(), "sumBattleExpertHighScore", -3430555142569753657L);
        setLongField(term66948, term66948.getClass(), "sumBattleMasterHighScore", -5740116915366900340L);
        setLongField(term66948, term66948.getClass(), "sumBattleLunaticHighScore", 4535342579444446360L);
        setField(term66948, term66948.getClass(), "eventWatchedDate", "QsFsmwqvwM");
        setField(term66948, term66948.getClass(), "cmEventWatchedDate", "pSDSdAjceB");
        setField(term66948, term66948.getClass(), "firstGameId", "TGMaCYOqml");
        setField(term66948, term66948.getClass(), "firstRomVersion", "btqCBRPcNd");
        setField(term66948, term66948.getClass(), "firstDataVersion", "LEbiLyVKDG");
        setField(term66948, term66948.getClass(), "firstPlayDate", "PzUzEwZhUT");
        setField(term66948, term66948.getClass(), "lastGameId", "bJKvwEFeLG");
        setField(term66948, term66948.getClass(), "lastRomVersion", "MQzXbKeQIa");
        setField(term66948, term66948.getClass(), "lastDataVersion", "YHDwlXeRTi");
        setField(term66948, term66948.getClass(), "compatibleCmVersion", "WIJiLZqEqc");
        setField(term66948, term66948.getClass(), "lastPlayDate", "OuZMVgPpoE");
        setIntField(term66948, term66948.getClass(), "lastPlaceId", 1995841517);
        setField(term66948, term66948.getClass(), "lastPlaceName", "nDUyFfanYp");
        setIntField(term66948, term66948.getClass(), "lastRegionId", -1865261069);
        setField(term66948, term66948.getClass(), "lastRegionName", "hYmQxPxTFd");
        setIntField(term66948, term66948.getClass(), "lastAllNetId", 159666228);
        setField(term66948, term66948.getClass(), "lastClientId", "Clkrygzvpw");
        setIntField(term66948, term66948.getClass(), "lastUsedDeckId", -1706840691);
        setIntField(term66948, term66948.getClass(), "lastPlayMusicLevel", -722277466);
        setIntField(term66948, term66948.getClass(), "lastEmoneyBrand", 1000587160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TPzGOBNENK";
        callMethod(klass, "setFirstGameId", argTypes, term66948, args);
    }

};


