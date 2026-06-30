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

public class UserTradeItem_setChapterId_9014384218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154113;
     Object term154381;

    public UserTradeItem_setChapterId_9014384218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154119 = new Long(-7632759764262745126L);
        term154113 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term154115 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term154117 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term154133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term154143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154148 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term154113, term154113.getClass(), "id", -8728361429528711927L);
        setLongField(term154115, term154115.getClass(), "id", 6121525178540002640L);
        setLongField(term154117, term154117.getClass(), "id", -4483971702455014477L);
        setField(term154117, term154117.getClass(), "extId", term154119);
        setField(term154117, term154117.getClass(), "luid", "DqbGwXvmSC");
        setIntField(term154134, term154134.getClass(), "year", 2023);
        setShortField(term154134, term154134.getClass(), "month", (short) 11);
        setShortField(term154134, term154134.getClass(), "day", (short) 25);
        setField(term154133, term154133.getClass(), "date", term154134);
        setByteField(term154138, term154138.getClass(), "hour", (byte) 1);
        setByteField(term154138, term154138.getClass(), "minute", (byte) 27);
        setByteField(term154138, term154138.getClass(), "second", (byte) 54);
        setIntField(term154138, term154138.getClass(), "nano", 382362839);
        setField(term154133, term154133.getClass(), "time", term154138);
        setField(term154117, term154117.getClass(), "registerTime", term154133);
        setIntField(term154144, term154144.getClass(), "year", 2019);
        setShortField(term154144, term154144.getClass(), "month", (short) 7);
        setShortField(term154144, term154144.getClass(), "day", (short) 3);
        setField(term154143, term154143.getClass(), "date", term154144);
        setByteField(term154148, term154148.getClass(), "hour", (byte) 1);
        setByteField(term154148, term154148.getClass(), "minute", (byte) 7);
        setByteField(term154148, term154148.getClass(), "second", (byte) 43);
        setIntField(term154148, term154148.getClass(), "nano", 632872277);
        setField(term154143, term154143.getClass(), "time", term154148);
        setField(term154117, term154117.getClass(), "accessTime", term154143);
        setField(term154115, term154115.getClass(), "card", term154117);
        setField(term154115, term154115.getClass(), "userName", "aIIGYUOaLR");
        setIntField(term154115, term154115.getClass(), "level", -1485310915);
        setIntField(term154115, term154115.getClass(), "reincarnationNum", 931952204);
        setLongField(term154115, term154115.getClass(), "exp", 2256815315800053441L);
        setLongField(term154115, term154115.getClass(), "point", -4184721762429461078L);
        setLongField(term154115, term154115.getClass(), "totalPoint", -7830901670802129440L);
        setIntField(term154115, term154115.getClass(), "playCount", -1752243259);
        setIntField(term154115, term154115.getClass(), "jewelCount", 1622508431);
        setIntField(term154115, term154115.getClass(), "totalJewelCount", 288439377);
        setIntField(term154115, term154115.getClass(), "medalCount", 122193410);
        setIntField(term154115, term154115.getClass(), "playerRating", 1299505147);
        setIntField(term154115, term154115.getClass(), "highestRating", 1080293155);
        setIntField(term154115, term154115.getClass(), "battlePoint", -538823875);
        setIntField(term154115, term154115.getClass(), "bestBattlePoint", 2138473011);
        setIntField(term154115, term154115.getClass(), "overDamageBattlePoint", 710964891);
        setBooleanField(term154115, term154115.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term154115, term154115.getClass(), "nameplateId", 597579516);
        setIntField(term154115, term154115.getClass(), "trophyId", -1074602151);
        setIntField(term154115, term154115.getClass(), "cardId", -1806046732);
        setIntField(term154115, term154115.getClass(), "characterId", -244632280);
        setIntField(term154115, term154115.getClass(), "characterVoiceNo", -364640291);
        setIntField(term154115, term154115.getClass(), "tabSetting", 14738351);
        setIntField(term154115, term154115.getClass(), "tabSortSetting", 2115515217);
        setIntField(term154115, term154115.getClass(), "cardCategorySetting", -2061313449);
        setIntField(term154115, term154115.getClass(), "cardSortSetting", 1235250395);
        setIntField(term154115, term154115.getClass(), "rivalScoreCategorySetting", -554298931);
        setIntField(term154115, term154115.getClass(), "playedTutorialBit", 1776900753);
        setIntField(term154115, term154115.getClass(), "firstTutorialCancelNum", 77426182);
        setLongField(term154115, term154115.getClass(), "sumTechHighScore", 7499440582286286516L);
        setLongField(term154115, term154115.getClass(), "sumTechBasicHighScore", 7767765320353951427L);
        setLongField(term154115, term154115.getClass(), "sumTechAdvancedHighScore", -8445460864939401881L);
        setLongField(term154115, term154115.getClass(), "sumTechExpertHighScore", 1455676383387654807L);
        setLongField(term154115, term154115.getClass(), "sumTechMasterHighScore", -6746436482856660533L);
        setLongField(term154115, term154115.getClass(), "sumTechLunaticHighScore", 4540774872514545895L);
        setLongField(term154115, term154115.getClass(), "sumBattleHighScore", -1463127326798939587L);
        setLongField(term154115, term154115.getClass(), "sumBattleBasicHighScore", 8817459190616045853L);
        setLongField(term154115, term154115.getClass(), "sumBattleAdvancedHighScore", 8440192221331571349L);
        setLongField(term154115, term154115.getClass(), "sumBattleExpertHighScore", 5709410403788658761L);
        setLongField(term154115, term154115.getClass(), "sumBattleMasterHighScore", 310032710294616459L);
        setLongField(term154115, term154115.getClass(), "sumBattleLunaticHighScore", 5200635552107859745L);
        setField(term154115, term154115.getClass(), "eventWatchedDate", "saqdcGiRfC");
        setField(term154115, term154115.getClass(), "cmEventWatchedDate", "xhQojgWfiF");
        setField(term154115, term154115.getClass(), "firstGameId", "hFxhVQNBry");
        setField(term154115, term154115.getClass(), "firstRomVersion", "JrFOkJdQNH");
        setField(term154115, term154115.getClass(), "firstDataVersion", "SgjnbEXsMB");
        setField(term154115, term154115.getClass(), "firstPlayDate", "vvGvdVbopl");
        setField(term154115, term154115.getClass(), "lastGameId", "oWsWBayari");
        setField(term154115, term154115.getClass(), "lastRomVersion", "zHAsiDDJCb");
        setField(term154115, term154115.getClass(), "lastDataVersion", "yQPIyadxOz");
        setField(term154115, term154115.getClass(), "compatibleCmVersion", "pBpdxKmyFY");
        setField(term154115, term154115.getClass(), "lastPlayDate", "lEnMgQzxMz");
        setIntField(term154115, term154115.getClass(), "lastPlaceId", -395423165);
        setField(term154115, term154115.getClass(), "lastPlaceName", "KYrVRQYYLY");
        setIntField(term154115, term154115.getClass(), "lastRegionId", -990526245);
        setField(term154115, term154115.getClass(), "lastRegionName", "iiXiwzHGtZ");
        setIntField(term154115, term154115.getClass(), "lastAllNetId", 2133565885);
        setField(term154115, term154115.getClass(), "lastClientId", "vMUryzcVEt");
        setIntField(term154115, term154115.getClass(), "lastUsedDeckId", -1197317011);
        setIntField(term154115, term154115.getClass(), "lastPlayMusicLevel", -622026055);
        setIntField(term154115, term154115.getClass(), "lastEmoneyBrand", -253994513);
        setField(term154113, term154113.getClass(), "user", term154115);
        setIntField(term154113, term154113.getClass(), "chapterId", -797621149);
        setIntField(term154113, term154113.getClass(), "tradeItemId", 1348878482);
        setIntField(term154113, term154113.getClass(), "tradeCount", 1839647396);
        term154381 = new Integer(749558175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term154381;
        callMethod(klass, "setChapterId", argTypes, term154113, args);
    }

};


