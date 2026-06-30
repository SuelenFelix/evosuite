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

public class UserData_setLevel_168488909465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49483;
     Object term49746;

    public UserData_setLevel_168488909465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49487 = new Long(-4924950707540628022L);
        term49483 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term49485 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49506 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49516 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49483, term49483.getClass(), "id", 6929574138600777534L);
        setLongField(term49485, term49485.getClass(), "id", 7306228148506563384L);
        setField(term49485, term49485.getClass(), "extId", term49487);
        setField(term49485, term49485.getClass(), "luid", "HcfabJkuEQ");
        setIntField(term49502, term49502.getClass(), "year", 2020);
        setShortField(term49502, term49502.getClass(), "month", (short) 1);
        setShortField(term49502, term49502.getClass(), "day", (short) 23);
        setField(term49501, term49501.getClass(), "date", term49502);
        setByteField(term49506, term49506.getClass(), "hour", (byte) 17);
        setByteField(term49506, term49506.getClass(), "minute", (byte) 24);
        setByteField(term49506, term49506.getClass(), "second", (byte) 54);
        setIntField(term49506, term49506.getClass(), "nano", 261767355);
        setField(term49501, term49501.getClass(), "time", term49506);
        setField(term49485, term49485.getClass(), "registerTime", term49501);
        setIntField(term49512, term49512.getClass(), "year", 2011);
        setShortField(term49512, term49512.getClass(), "month", (short) 1);
        setShortField(term49512, term49512.getClass(), "day", (short) 20);
        setField(term49511, term49511.getClass(), "date", term49512);
        setByteField(term49516, term49516.getClass(), "hour", (byte) 5);
        setByteField(term49516, term49516.getClass(), "minute", (byte) 23);
        setByteField(term49516, term49516.getClass(), "second", (byte) 54);
        setIntField(term49516, term49516.getClass(), "nano", 4207750);
        setField(term49511, term49511.getClass(), "time", term49516);
        setField(term49485, term49485.getClass(), "accessTime", term49511);
        setField(term49483, term49483.getClass(), "card", term49485);
        setField(term49483, term49483.getClass(), "userName", "JlnoFYxLfk");
        setIntField(term49483, term49483.getClass(), "level", -1450230869);
        setIntField(term49483, term49483.getClass(), "reincarnationNum", -785918740);
        setLongField(term49483, term49483.getClass(), "exp", -3759875741196067125L);
        setLongField(term49483, term49483.getClass(), "point", 3301022507846192876L);
        setLongField(term49483, term49483.getClass(), "totalPoint", -436006713622235897L);
        setIntField(term49483, term49483.getClass(), "playCount", 384642213);
        setIntField(term49483, term49483.getClass(), "jewelCount", 1673176720);
        setIntField(term49483, term49483.getClass(), "totalJewelCount", 1084767630);
        setIntField(term49483, term49483.getClass(), "medalCount", 1634202484);
        setIntField(term49483, term49483.getClass(), "playerRating", -1738191161);
        setIntField(term49483, term49483.getClass(), "highestRating", 48416396);
        setIntField(term49483, term49483.getClass(), "battlePoint", -1949441630);
        setIntField(term49483, term49483.getClass(), "bestBattlePoint", 1641286805);
        setIntField(term49483, term49483.getClass(), "overDamageBattlePoint", -370516662);
        setBooleanField(term49483, term49483.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term49483, term49483.getClass(), "nameplateId", -372652916);
        setIntField(term49483, term49483.getClass(), "trophyId", 1915058189);
        setIntField(term49483, term49483.getClass(), "cardId", -1466811987);
        setIntField(term49483, term49483.getClass(), "characterId", 469445830);
        setIntField(term49483, term49483.getClass(), "characterVoiceNo", -1482217659);
        setIntField(term49483, term49483.getClass(), "tabSetting", 1650302326);
        setIntField(term49483, term49483.getClass(), "tabSortSetting", -123648353);
        setIntField(term49483, term49483.getClass(), "cardCategorySetting", -992215212);
        setIntField(term49483, term49483.getClass(), "cardSortSetting", 665125325);
        setIntField(term49483, term49483.getClass(), "rivalScoreCategorySetting", -1180829225);
        setIntField(term49483, term49483.getClass(), "playedTutorialBit", -19961314);
        setIntField(term49483, term49483.getClass(), "firstTutorialCancelNum", 903876999);
        setLongField(term49483, term49483.getClass(), "sumTechHighScore", -5888397861122761293L);
        setLongField(term49483, term49483.getClass(), "sumTechBasicHighScore", -2860770035477349220L);
        setLongField(term49483, term49483.getClass(), "sumTechAdvancedHighScore", 1263388002539564753L);
        setLongField(term49483, term49483.getClass(), "sumTechExpertHighScore", 226144339570799839L);
        setLongField(term49483, term49483.getClass(), "sumTechMasterHighScore", 2847433178831759443L);
        setLongField(term49483, term49483.getClass(), "sumTechLunaticHighScore", 4472414114652978334L);
        setLongField(term49483, term49483.getClass(), "sumBattleHighScore", 6759285425911636341L);
        setLongField(term49483, term49483.getClass(), "sumBattleBasicHighScore", -2312307545038820068L);
        setLongField(term49483, term49483.getClass(), "sumBattleAdvancedHighScore", -5076378196239032509L);
        setLongField(term49483, term49483.getClass(), "sumBattleExpertHighScore", -3954441930739441319L);
        setLongField(term49483, term49483.getClass(), "sumBattleMasterHighScore", -5840925148221311102L);
        setLongField(term49483, term49483.getClass(), "sumBattleLunaticHighScore", -4208738507614245483L);
        setField(term49483, term49483.getClass(), "eventWatchedDate", "tMMLkDkFYW");
        setField(term49483, term49483.getClass(), "cmEventWatchedDate", "EYJXMlkLoO");
        setField(term49483, term49483.getClass(), "firstGameId", "qJtkJJhOSV");
        setField(term49483, term49483.getClass(), "firstRomVersion", "vQbiGKncal");
        setField(term49483, term49483.getClass(), "firstDataVersion", "NTSNSiYeUu");
        setField(term49483, term49483.getClass(), "firstPlayDate", "SBTEFDmQVY");
        setField(term49483, term49483.getClass(), "lastGameId", "ohZpRiNDZM");
        setField(term49483, term49483.getClass(), "lastRomVersion", "qEXIxhmUwz");
        setField(term49483, term49483.getClass(), "lastDataVersion", "RlyxtfCqKY");
        setField(term49483, term49483.getClass(), "compatibleCmVersion", "kyTUkLCRYm");
        setField(term49483, term49483.getClass(), "lastPlayDate", "oAotZgNUFH");
        setIntField(term49483, term49483.getClass(), "lastPlaceId", -20697214);
        setField(term49483, term49483.getClass(), "lastPlaceName", "TowhQcovXu");
        setIntField(term49483, term49483.getClass(), "lastRegionId", -374105961);
        setField(term49483, term49483.getClass(), "lastRegionName", "UFGOnIMOzf");
        setIntField(term49483, term49483.getClass(), "lastAllNetId", -198328789);
        setField(term49483, term49483.getClass(), "lastClientId", "ySiyRlAQpt");
        setIntField(term49483, term49483.getClass(), "lastUsedDeckId", -158694757);
        setIntField(term49483, term49483.getClass(), "lastPlayMusicLevel", -1855067606);
        setIntField(term49483, term49483.getClass(), "lastEmoneyBrand", -433967657);
        term49746 = new Integer(1411661019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49746;
        callMethod(klass, "setLevel", argTypes, term49483, args);
    }

};


