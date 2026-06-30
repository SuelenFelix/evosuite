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

public class UserStory_getStoryId_14257050133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158919;

    public UserStory_getStoryId_14257050133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158925 = new Long(-9147545274054597570L);
        term158919 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term158921 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term158923 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158954 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158919, term158919.getClass(), "id", 6674236555977199465L);
        setLongField(term158921, term158921.getClass(), "id", -3049611432827209269L);
        setLongField(term158923, term158923.getClass(), "id", 8552991378907316462L);
        setField(term158923, term158923.getClass(), "extId", term158925);
        setField(term158923, term158923.getClass(), "luid", "PviulmdPhA");
        setIntField(term158940, term158940.getClass(), "year", 2022);
        setShortField(term158940, term158940.getClass(), "month", (short) 8);
        setShortField(term158940, term158940.getClass(), "day", (short) 26);
        setField(term158939, term158939.getClass(), "date", term158940);
        setByteField(term158944, term158944.getClass(), "hour", (byte) 20);
        setByteField(term158944, term158944.getClass(), "minute", (byte) 26);
        setByteField(term158944, term158944.getClass(), "second", (byte) 55);
        setIntField(term158944, term158944.getClass(), "nano", 380890210);
        setField(term158939, term158939.getClass(), "time", term158944);
        setField(term158923, term158923.getClass(), "registerTime", term158939);
        setIntField(term158950, term158950.getClass(), "year", 2010);
        setShortField(term158950, term158950.getClass(), "month", (short) 6);
        setShortField(term158950, term158950.getClass(), "day", (short) 21);
        setField(term158949, term158949.getClass(), "date", term158950);
        setByteField(term158954, term158954.getClass(), "hour", (byte) 4);
        setByteField(term158954, term158954.getClass(), "minute", (byte) 6);
        setByteField(term158954, term158954.getClass(), "second", (byte) 54);
        setIntField(term158954, term158954.getClass(), "nano", 837855935);
        setField(term158949, term158949.getClass(), "time", term158954);
        setField(term158923, term158923.getClass(), "accessTime", term158949);
        setField(term158921, term158921.getClass(), "card", term158923);
        setField(term158921, term158921.getClass(), "userName", "NAUDTajaNN");
        setIntField(term158921, term158921.getClass(), "level", 1816216567);
        setIntField(term158921, term158921.getClass(), "reincarnationNum", -1787268270);
        setLongField(term158921, term158921.getClass(), "exp", 2603695605373080196L);
        setLongField(term158921, term158921.getClass(), "point", -2594505434263742926L);
        setLongField(term158921, term158921.getClass(), "totalPoint", 4609669195881358391L);
        setIntField(term158921, term158921.getClass(), "playCount", 612540772);
        setIntField(term158921, term158921.getClass(), "jewelCount", 664095791);
        setIntField(term158921, term158921.getClass(), "totalJewelCount", 1805310704);
        setIntField(term158921, term158921.getClass(), "medalCount", 1348119055);
        setIntField(term158921, term158921.getClass(), "playerRating", -1042667016);
        setIntField(term158921, term158921.getClass(), "highestRating", -1341064078);
        setIntField(term158921, term158921.getClass(), "battlePoint", -1088816172);
        setIntField(term158921, term158921.getClass(), "bestBattlePoint", -1935578983);
        setIntField(term158921, term158921.getClass(), "overDamageBattlePoint", 1905602832);
        setBooleanField(term158921, term158921.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term158921, term158921.getClass(), "nameplateId", -431572220);
        setIntField(term158921, term158921.getClass(), "trophyId", 972986984);
        setIntField(term158921, term158921.getClass(), "cardId", -1542767364);
        setIntField(term158921, term158921.getClass(), "characterId", -597174536);
        setIntField(term158921, term158921.getClass(), "characterVoiceNo", -23544043);
        setIntField(term158921, term158921.getClass(), "tabSetting", -1186171274);
        setIntField(term158921, term158921.getClass(), "tabSortSetting", -1573775399);
        setIntField(term158921, term158921.getClass(), "cardCategorySetting", -301649033);
        setIntField(term158921, term158921.getClass(), "cardSortSetting", 1335266802);
        setIntField(term158921, term158921.getClass(), "rivalScoreCategorySetting", -1732408059);
        setIntField(term158921, term158921.getClass(), "playedTutorialBit", 1433024397);
        setIntField(term158921, term158921.getClass(), "firstTutorialCancelNum", 1216072735);
        setLongField(term158921, term158921.getClass(), "sumTechHighScore", -6405933697029315049L);
        setLongField(term158921, term158921.getClass(), "sumTechBasicHighScore", -7291040769943508901L);
        setLongField(term158921, term158921.getClass(), "sumTechAdvancedHighScore", -413934315817820959L);
        setLongField(term158921, term158921.getClass(), "sumTechExpertHighScore", 293235674756964190L);
        setLongField(term158921, term158921.getClass(), "sumTechMasterHighScore", 3569712085909490165L);
        setLongField(term158921, term158921.getClass(), "sumTechLunaticHighScore", -500829433762980337L);
        setLongField(term158921, term158921.getClass(), "sumBattleHighScore", 6503491258609255906L);
        setLongField(term158921, term158921.getClass(), "sumBattleBasicHighScore", -2308335036861100736L);
        setLongField(term158921, term158921.getClass(), "sumBattleAdvancedHighScore", -7820554667236051803L);
        setLongField(term158921, term158921.getClass(), "sumBattleExpertHighScore", 8287717396745699238L);
        setLongField(term158921, term158921.getClass(), "sumBattleMasterHighScore", 2780391456169453608L);
        setLongField(term158921, term158921.getClass(), "sumBattleLunaticHighScore", 6274100094579147268L);
        setField(term158921, term158921.getClass(), "eventWatchedDate", "BgJwVzSZYi");
        setField(term158921, term158921.getClass(), "cmEventWatchedDate", "ecRYXrSwPc");
        setField(term158921, term158921.getClass(), "firstGameId", "EgUbHeKEEX");
        setField(term158921, term158921.getClass(), "firstRomVersion", "qdXkDdgkzv");
        setField(term158921, term158921.getClass(), "firstDataVersion", "bwXWpCUaun");
        setField(term158921, term158921.getClass(), "firstPlayDate", "bNhvwOrXoC");
        setField(term158921, term158921.getClass(), "lastGameId", "QHwFfYSCNm");
        setField(term158921, term158921.getClass(), "lastRomVersion", "TDpWaJHRZc");
        setField(term158921, term158921.getClass(), "lastDataVersion", "nsydNohggs");
        setField(term158921, term158921.getClass(), "compatibleCmVersion", "NwQXMulIlF");
        setField(term158921, term158921.getClass(), "lastPlayDate", "lEtoSVazWN");
        setIntField(term158921, term158921.getClass(), "lastPlaceId", 1880806607);
        setField(term158921, term158921.getClass(), "lastPlaceName", "ddDDOEjMuN");
        setIntField(term158921, term158921.getClass(), "lastRegionId", 265152714);
        setField(term158921, term158921.getClass(), "lastRegionName", "tHBufRenNj");
        setIntField(term158921, term158921.getClass(), "lastAllNetId", 1291985298);
        setField(term158921, term158921.getClass(), "lastClientId", "wtWSSbxhjb");
        setIntField(term158921, term158921.getClass(), "lastUsedDeckId", -1615684635);
        setIntField(term158921, term158921.getClass(), "lastPlayMusicLevel", -725181754);
        setIntField(term158921, term158921.getClass(), "lastEmoneyBrand", -2117106210);
        setField(term158919, term158919.getClass(), "user", term158921);
        setIntField(term158919, term158919.getClass(), "storyId", -767668699);
        setIntField(term158919, term158919.getClass(), "lastChapterId", 1274445811);
        setIntField(term158919, term158919.getClass(), "jewelCount", 1903103775);
        setIntField(term158919, term158919.getClass(), "lastPlayMusicId", -5489488);
        setIntField(term158919, term158919.getClass(), "lastPlayMusicCategory", -1846449623);
        setIntField(term158919, term158919.getClass(), "lastPlayMusicLevel", -1053745732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStoryId", argTypes, term158919, args);
    }

};


