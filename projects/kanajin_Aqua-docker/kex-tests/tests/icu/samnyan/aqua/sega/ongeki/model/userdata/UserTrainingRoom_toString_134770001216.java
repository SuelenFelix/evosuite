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

public class UserTrainingRoom_toString_134770001216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20898;

    public UserTrainingRoom_toString_134770001216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20904 = new Long(4044358158040652353L);
        term20898 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term20900 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term20902 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term20918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20933 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term20898, term20898.getClass(), "id", 3853743792832767733L);
        setLongField(term20900, term20900.getClass(), "id", -6064923943154213519L);
        setLongField(term20902, term20902.getClass(), "id", -6344058468200613078L);
        setField(term20902, term20902.getClass(), "extId", term20904);
        setField(term20902, term20902.getClass(), "luid", "HuOUlaFmvJ");
        setIntField(term20919, term20919.getClass(), "year", 2020);
        setShortField(term20919, term20919.getClass(), "month", (short) 12);
        setShortField(term20919, term20919.getClass(), "day", (short) 21);
        setField(term20918, term20918.getClass(), "date", term20919);
        setByteField(term20923, term20923.getClass(), "hour", (byte) 20);
        setByteField(term20923, term20923.getClass(), "minute", (byte) 16);
        setByteField(term20923, term20923.getClass(), "second", (byte) 59);
        setIntField(term20923, term20923.getClass(), "nano", 976524801);
        setField(term20918, term20918.getClass(), "time", term20923);
        setField(term20902, term20902.getClass(), "registerTime", term20918);
        setIntField(term20929, term20929.getClass(), "year", 2028);
        setShortField(term20929, term20929.getClass(), "month", (short) 5);
        setShortField(term20929, term20929.getClass(), "day", (short) 15);
        setField(term20928, term20928.getClass(), "date", term20929);
        setByteField(term20933, term20933.getClass(), "hour", (byte) 20);
        setByteField(term20933, term20933.getClass(), "minute", (byte) 31);
        setByteField(term20933, term20933.getClass(), "second", (byte) 49);
        setIntField(term20933, term20933.getClass(), "nano", 945744862);
        setField(term20928, term20928.getClass(), "time", term20933);
        setField(term20902, term20902.getClass(), "accessTime", term20928);
        setField(term20900, term20900.getClass(), "card", term20902);
        setField(term20900, term20900.getClass(), "userName", "dWVwcwFGNo");
        setIntField(term20900, term20900.getClass(), "level", 329424176);
        setIntField(term20900, term20900.getClass(), "reincarnationNum", -1897199214);
        setLongField(term20900, term20900.getClass(), "exp", 9069301103965727560L);
        setLongField(term20900, term20900.getClass(), "point", 1078204819466025938L);
        setLongField(term20900, term20900.getClass(), "totalPoint", -4526944004625263747L);
        setIntField(term20900, term20900.getClass(), "playCount", -1016478729);
        setIntField(term20900, term20900.getClass(), "jewelCount", -206889003);
        setIntField(term20900, term20900.getClass(), "totalJewelCount", 638046409);
        setIntField(term20900, term20900.getClass(), "medalCount", 427274898);
        setIntField(term20900, term20900.getClass(), "playerRating", -1654552020);
        setIntField(term20900, term20900.getClass(), "highestRating", -1049546692);
        setIntField(term20900, term20900.getClass(), "battlePoint", 1397781598);
        setIntField(term20900, term20900.getClass(), "bestBattlePoint", -44720365);
        setIntField(term20900, term20900.getClass(), "overDamageBattlePoint", 1963632911);
        setBooleanField(term20900, term20900.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term20900, term20900.getClass(), "nameplateId", -1100497683);
        setIntField(term20900, term20900.getClass(), "trophyId", 155423433);
        setIntField(term20900, term20900.getClass(), "cardId", -815471632);
        setIntField(term20900, term20900.getClass(), "characterId", -1469668708);
        setIntField(term20900, term20900.getClass(), "characterVoiceNo", 1796950482);
        setIntField(term20900, term20900.getClass(), "tabSetting", -945759470);
        setIntField(term20900, term20900.getClass(), "tabSortSetting", 657342039);
        setIntField(term20900, term20900.getClass(), "cardCategorySetting", 1483999606);
        setIntField(term20900, term20900.getClass(), "cardSortSetting", 1871761182);
        setIntField(term20900, term20900.getClass(), "rivalScoreCategorySetting", 233983728);
        setIntField(term20900, term20900.getClass(), "playedTutorialBit", -1650132476);
        setIntField(term20900, term20900.getClass(), "firstTutorialCancelNum", 1719680265);
        setLongField(term20900, term20900.getClass(), "sumTechHighScore", -8195504192950938590L);
        setLongField(term20900, term20900.getClass(), "sumTechBasicHighScore", -3141593811423226559L);
        setLongField(term20900, term20900.getClass(), "sumTechAdvancedHighScore", 165312735504471081L);
        setLongField(term20900, term20900.getClass(), "sumTechExpertHighScore", 7910323873668469704L);
        setLongField(term20900, term20900.getClass(), "sumTechMasterHighScore", -8034026767184380879L);
        setLongField(term20900, term20900.getClass(), "sumTechLunaticHighScore", -1865079020076651952L);
        setLongField(term20900, term20900.getClass(), "sumBattleHighScore", -6255610460583667093L);
        setLongField(term20900, term20900.getClass(), "sumBattleBasicHighScore", -3947173237186855838L);
        setLongField(term20900, term20900.getClass(), "sumBattleAdvancedHighScore", 1186857065042697930L);
        setLongField(term20900, term20900.getClass(), "sumBattleExpertHighScore", 1659080369100392023L);
        setLongField(term20900, term20900.getClass(), "sumBattleMasterHighScore", 854087753192360238L);
        setLongField(term20900, term20900.getClass(), "sumBattleLunaticHighScore", -6246278604466261475L);
        setField(term20900, term20900.getClass(), "eventWatchedDate", "PNdLRrSAIY");
        setField(term20900, term20900.getClass(), "cmEventWatchedDate", "nJnRIRiLZK");
        setField(term20900, term20900.getClass(), "firstGameId", "eWnrMSbYbT");
        setField(term20900, term20900.getClass(), "firstRomVersion", "AjoFvDFyCY");
        setField(term20900, term20900.getClass(), "firstDataVersion", "OFTJwdPiTG");
        setField(term20900, term20900.getClass(), "firstPlayDate", "QiUprSEluR");
        setField(term20900, term20900.getClass(), "lastGameId", "cDOXXottZh");
        setField(term20900, term20900.getClass(), "lastRomVersion", "rfqJDkDppz");
        setField(term20900, term20900.getClass(), "lastDataVersion", "MGorMVGauT");
        setField(term20900, term20900.getClass(), "compatibleCmVersion", "jXKxUGTuEF");
        setField(term20900, term20900.getClass(), "lastPlayDate", "nDCcyhiTnS");
        setIntField(term20900, term20900.getClass(), "lastPlaceId", -1890898783);
        setField(term20900, term20900.getClass(), "lastPlaceName", "Bcivwcjece");
        setIntField(term20900, term20900.getClass(), "lastRegionId", 1357632911);
        setField(term20900, term20900.getClass(), "lastRegionName", "QTefjRuiez");
        setIntField(term20900, term20900.getClass(), "lastAllNetId", 1768195761);
        setField(term20900, term20900.getClass(), "lastClientId", "SQZVNkAVBB");
        setIntField(term20900, term20900.getClass(), "lastUsedDeckId", -1382661134);
        setIntField(term20900, term20900.getClass(), "lastPlayMusicLevel", -1042022818);
        setIntField(term20900, term20900.getClass(), "lastEmoneyBrand", 317372051);
        setField(term20898, term20898.getClass(), "user", term20900);
        setField(term20898, term20898.getClass(), "authKey", "mrSAYJlddZ");
        setIntField(term20898, term20898.getClass(), "roomId", 892170444);
        setIntField(term20898, term20898.getClass(), "cardId", -82417507);
        setField(term20898, term20898.getClass(), "valueDate", "KbwxawvYsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20898, args);
    }

};


