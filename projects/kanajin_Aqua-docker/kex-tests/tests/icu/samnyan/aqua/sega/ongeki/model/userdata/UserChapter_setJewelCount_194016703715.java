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

public class UserChapter_setJewelCount_194016703715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90126;
     Object term90400;

    public UserChapter_setJewelCount_194016703715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90132 = new Long(-7310273014364148916L);
        term90126 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term90128 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term90130 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90161 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90126, term90126.getClass(), "id", 4371439569332200617L);
        setLongField(term90128, term90128.getClass(), "id", 6474084420599808766L);
        setLongField(term90130, term90130.getClass(), "id", -8402003070954353411L);
        setField(term90130, term90130.getClass(), "extId", term90132);
        setField(term90130, term90130.getClass(), "luid", "TwTeGrJqeV");
        setIntField(term90147, term90147.getClass(), "year", 2015);
        setShortField(term90147, term90147.getClass(), "month", (short) 1);
        setShortField(term90147, term90147.getClass(), "day", (short) 23);
        setField(term90146, term90146.getClass(), "date", term90147);
        setByteField(term90151, term90151.getClass(), "hour", (byte) 0);
        setByteField(term90151, term90151.getClass(), "minute", (byte) 5);
        setByteField(term90151, term90151.getClass(), "second", (byte) 21);
        setIntField(term90151, term90151.getClass(), "nano", 402778195);
        setField(term90146, term90146.getClass(), "time", term90151);
        setField(term90130, term90130.getClass(), "registerTime", term90146);
        setIntField(term90157, term90157.getClass(), "year", 2022);
        setShortField(term90157, term90157.getClass(), "month", (short) 4);
        setShortField(term90157, term90157.getClass(), "day", (short) 2);
        setField(term90156, term90156.getClass(), "date", term90157);
        setByteField(term90161, term90161.getClass(), "hour", (byte) 21);
        setByteField(term90161, term90161.getClass(), "minute", (byte) 1);
        setByteField(term90161, term90161.getClass(), "second", (byte) 56);
        setIntField(term90161, term90161.getClass(), "nano", 418299217);
        setField(term90156, term90156.getClass(), "time", term90161);
        setField(term90130, term90130.getClass(), "accessTime", term90156);
        setField(term90128, term90128.getClass(), "card", term90130);
        setField(term90128, term90128.getClass(), "userName", "EmqjtKbtwp");
        setIntField(term90128, term90128.getClass(), "level", 1994324228);
        setIntField(term90128, term90128.getClass(), "reincarnationNum", 1551084552);
        setLongField(term90128, term90128.getClass(), "exp", -5271009603200420552L);
        setLongField(term90128, term90128.getClass(), "point", 7281428481290626426L);
        setLongField(term90128, term90128.getClass(), "totalPoint", 5565875410088779184L);
        setIntField(term90128, term90128.getClass(), "playCount", 1435658339);
        setIntField(term90128, term90128.getClass(), "jewelCount", 1802290366);
        setIntField(term90128, term90128.getClass(), "totalJewelCount", -1308723047);
        setIntField(term90128, term90128.getClass(), "medalCount", -1225238765);
        setIntField(term90128, term90128.getClass(), "playerRating", -546245327);
        setIntField(term90128, term90128.getClass(), "highestRating", 1671823678);
        setIntField(term90128, term90128.getClass(), "battlePoint", -1929941351);
        setIntField(term90128, term90128.getClass(), "bestBattlePoint", -137121647);
        setIntField(term90128, term90128.getClass(), "overDamageBattlePoint", 503819416);
        setBooleanField(term90128, term90128.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term90128, term90128.getClass(), "nameplateId", -1959893804);
        setIntField(term90128, term90128.getClass(), "trophyId", -983886756);
        setIntField(term90128, term90128.getClass(), "cardId", 662682481);
        setIntField(term90128, term90128.getClass(), "characterId", 51649517);
        setIntField(term90128, term90128.getClass(), "characterVoiceNo", -416813909);
        setIntField(term90128, term90128.getClass(), "tabSetting", -894882289);
        setIntField(term90128, term90128.getClass(), "tabSortSetting", 270964023);
        setIntField(term90128, term90128.getClass(), "cardCategorySetting", -66130728);
        setIntField(term90128, term90128.getClass(), "cardSortSetting", -720277275);
        setIntField(term90128, term90128.getClass(), "rivalScoreCategorySetting", 1131634307);
        setIntField(term90128, term90128.getClass(), "playedTutorialBit", -898785465);
        setIntField(term90128, term90128.getClass(), "firstTutorialCancelNum", 1852804936);
        setLongField(term90128, term90128.getClass(), "sumTechHighScore", -551041417190456838L);
        setLongField(term90128, term90128.getClass(), "sumTechBasicHighScore", -8928602881850680688L);
        setLongField(term90128, term90128.getClass(), "sumTechAdvancedHighScore", -5639249342644786079L);
        setLongField(term90128, term90128.getClass(), "sumTechExpertHighScore", 6504971121454149515L);
        setLongField(term90128, term90128.getClass(), "sumTechMasterHighScore", -572188774076591835L);
        setLongField(term90128, term90128.getClass(), "sumTechLunaticHighScore", -8345559137009717255L);
        setLongField(term90128, term90128.getClass(), "sumBattleHighScore", -4064620590537281520L);
        setLongField(term90128, term90128.getClass(), "sumBattleBasicHighScore", -2101617281193711802L);
        setLongField(term90128, term90128.getClass(), "sumBattleAdvancedHighScore", 4250276141606262084L);
        setLongField(term90128, term90128.getClass(), "sumBattleExpertHighScore", -4911308479149546611L);
        setLongField(term90128, term90128.getClass(), "sumBattleMasterHighScore", -757647052399927680L);
        setLongField(term90128, term90128.getClass(), "sumBattleLunaticHighScore", -431268573686905217L);
        setField(term90128, term90128.getClass(), "eventWatchedDate", "BIcjuljzhc");
        setField(term90128, term90128.getClass(), "cmEventWatchedDate", "SQDHGXSyaX");
        setField(term90128, term90128.getClass(), "firstGameId", "apdJoJDItV");
        setField(term90128, term90128.getClass(), "firstRomVersion", "UidjRWfqYK");
        setField(term90128, term90128.getClass(), "firstDataVersion", "SrmUNtssfz");
        setField(term90128, term90128.getClass(), "firstPlayDate", "ARMUeNVaDF");
        setField(term90128, term90128.getClass(), "lastGameId", "EUduJelZVE");
        setField(term90128, term90128.getClass(), "lastRomVersion", "uwfvHKGrlb");
        setField(term90128, term90128.getClass(), "lastDataVersion", "pSLljKyfgK");
        setField(term90128, term90128.getClass(), "compatibleCmVersion", "JTQXicvesT");
        setField(term90128, term90128.getClass(), "lastPlayDate", "lfirJwUftT");
        setIntField(term90128, term90128.getClass(), "lastPlaceId", 53950838);
        setField(term90128, term90128.getClass(), "lastPlaceName", "oiIvvyhWbf");
        setIntField(term90128, term90128.getClass(), "lastRegionId", -180263871);
        setField(term90128, term90128.getClass(), "lastRegionName", "EhCoIxBpMd");
        setIntField(term90128, term90128.getClass(), "lastAllNetId", 787708003);
        setField(term90128, term90128.getClass(), "lastClientId", "bUOSwRmGmB");
        setIntField(term90128, term90128.getClass(), "lastUsedDeckId", -1238626650);
        setIntField(term90128, term90128.getClass(), "lastPlayMusicLevel", 1251835216);
        setIntField(term90128, term90128.getClass(), "lastEmoneyBrand", -1462529055);
        setField(term90126, term90126.getClass(), "user", term90128);
        setIntField(term90126, term90126.getClass(), "chapterId", 1576372849);
        setIntField(term90126, term90126.getClass(), "jewelCount", 1296336460);
        setIntField(term90126, term90126.getClass(), "lastPlayMusicCategory", -1024380992);
        setIntField(term90126, term90126.getClass(), "lastPlayMusicId", 274867099);
        setIntField(term90126, term90126.getClass(), "lastPlayMusicLevel", -1432735615);
        setBooleanField(term90126, term90126.getClass(), "isStoryWatched", true);
        setBooleanField(term90126, term90126.getClass(), "isClear", true);
        setIntField(term90126, term90126.getClass(), "skipTiming1", 472705336);
        setIntField(term90126, term90126.getClass(), "skipTiming2", 988659735);
        term90400 = new Integer(1481448478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90400;
        callMethod(klass, "setJewelCount", argTypes, term90126, args);
    }

};


