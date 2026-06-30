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

public class UserItem_setItemId_181311348310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107299;
     Object term107568;

    public UserItem_setItemId_181311348310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107305 = new Long(-8862087040734407227L);
        term107299 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term107301 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term107303 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107334 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107299, term107299.getClass(), "id", 2076490946006669400L);
        setLongField(term107301, term107301.getClass(), "id", -4340558436394575009L);
        setLongField(term107303, term107303.getClass(), "id", -3912185940292374291L);
        setField(term107303, term107303.getClass(), "extId", term107305);
        setField(term107303, term107303.getClass(), "luid", "scTfhtEKVY");
        setIntField(term107320, term107320.getClass(), "year", 2027);
        setShortField(term107320, term107320.getClass(), "month", (short) 10);
        setShortField(term107320, term107320.getClass(), "day", (short) 12);
        setField(term107319, term107319.getClass(), "date", term107320);
        setByteField(term107324, term107324.getClass(), "hour", (byte) 23);
        setByteField(term107324, term107324.getClass(), "minute", (byte) 45);
        setByteField(term107324, term107324.getClass(), "second", (byte) 21);
        setIntField(term107324, term107324.getClass(), "nano", 866836785);
        setField(term107319, term107319.getClass(), "time", term107324);
        setField(term107303, term107303.getClass(), "registerTime", term107319);
        setIntField(term107330, term107330.getClass(), "year", 2022);
        setShortField(term107330, term107330.getClass(), "month", (short) 5);
        setShortField(term107330, term107330.getClass(), "day", (short) 27);
        setField(term107329, term107329.getClass(), "date", term107330);
        setByteField(term107334, term107334.getClass(), "hour", (byte) 11);
        setByteField(term107334, term107334.getClass(), "minute", (byte) 48);
        setByteField(term107334, term107334.getClass(), "second", (byte) 27);
        setIntField(term107334, term107334.getClass(), "nano", 101970300);
        setField(term107329, term107329.getClass(), "time", term107334);
        setField(term107303, term107303.getClass(), "accessTime", term107329);
        setField(term107301, term107301.getClass(), "card", term107303);
        setField(term107301, term107301.getClass(), "userName", "stIuzWhyLn");
        setIntField(term107301, term107301.getClass(), "level", 1250819263);
        setIntField(term107301, term107301.getClass(), "reincarnationNum", 1618070973);
        setLongField(term107301, term107301.getClass(), "exp", -2657261053068511416L);
        setLongField(term107301, term107301.getClass(), "point", -4275761724673637224L);
        setLongField(term107301, term107301.getClass(), "totalPoint", -4230964304129966463L);
        setIntField(term107301, term107301.getClass(), "playCount", -127271511);
        setIntField(term107301, term107301.getClass(), "jewelCount", -259183708);
        setIntField(term107301, term107301.getClass(), "totalJewelCount", 1520040482);
        setIntField(term107301, term107301.getClass(), "medalCount", 959050550);
        setIntField(term107301, term107301.getClass(), "playerRating", -622942789);
        setIntField(term107301, term107301.getClass(), "highestRating", -638909127);
        setIntField(term107301, term107301.getClass(), "battlePoint", -1583218821);
        setIntField(term107301, term107301.getClass(), "bestBattlePoint", 66936045);
        setIntField(term107301, term107301.getClass(), "overDamageBattlePoint", -734520364);
        setBooleanField(term107301, term107301.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term107301, term107301.getClass(), "nameplateId", -1309875787);
        setIntField(term107301, term107301.getClass(), "trophyId", 123831044);
        setIntField(term107301, term107301.getClass(), "cardId", 1698388280);
        setIntField(term107301, term107301.getClass(), "characterId", -44060117);
        setIntField(term107301, term107301.getClass(), "characterVoiceNo", 1362804360);
        setIntField(term107301, term107301.getClass(), "tabSetting", 1614080670);
        setIntField(term107301, term107301.getClass(), "tabSortSetting", -757156022);
        setIntField(term107301, term107301.getClass(), "cardCategorySetting", -711624128);
        setIntField(term107301, term107301.getClass(), "cardSortSetting", 1920273912);
        setIntField(term107301, term107301.getClass(), "rivalScoreCategorySetting", -1321346843);
        setIntField(term107301, term107301.getClass(), "playedTutorialBit", -1682796364);
        setIntField(term107301, term107301.getClass(), "firstTutorialCancelNum", -1747539443);
        setLongField(term107301, term107301.getClass(), "sumTechHighScore", 1000998944335552189L);
        setLongField(term107301, term107301.getClass(), "sumTechBasicHighScore", -50149617519867282L);
        setLongField(term107301, term107301.getClass(), "sumTechAdvancedHighScore", -6608961698637316603L);
        setLongField(term107301, term107301.getClass(), "sumTechExpertHighScore", 749347423874016750L);
        setLongField(term107301, term107301.getClass(), "sumTechMasterHighScore", -7626120186155328416L);
        setLongField(term107301, term107301.getClass(), "sumTechLunaticHighScore", 3475059906318237444L);
        setLongField(term107301, term107301.getClass(), "sumBattleHighScore", -7635249609359101107L);
        setLongField(term107301, term107301.getClass(), "sumBattleBasicHighScore", -3903053187723489607L);
        setLongField(term107301, term107301.getClass(), "sumBattleAdvancedHighScore", -9079493792633880488L);
        setLongField(term107301, term107301.getClass(), "sumBattleExpertHighScore", -4632223746452776127L);
        setLongField(term107301, term107301.getClass(), "sumBattleMasterHighScore", -8536743617101607452L);
        setLongField(term107301, term107301.getClass(), "sumBattleLunaticHighScore", -7736836683933796260L);
        setField(term107301, term107301.getClass(), "eventWatchedDate", "SsJjSkvgfn");
        setField(term107301, term107301.getClass(), "cmEventWatchedDate", "tUeeoALgnV");
        setField(term107301, term107301.getClass(), "firstGameId", "RKrTOHCtIL");
        setField(term107301, term107301.getClass(), "firstRomVersion", "weKhJGqEfg");
        setField(term107301, term107301.getClass(), "firstDataVersion", "TLUMeWJCRR");
        setField(term107301, term107301.getClass(), "firstPlayDate", "TuVnFrfwDO");
        setField(term107301, term107301.getClass(), "lastGameId", "HLaksjKQLu");
        setField(term107301, term107301.getClass(), "lastRomVersion", "tUmAYoRjRt");
        setField(term107301, term107301.getClass(), "lastDataVersion", "BAADpSzVyH");
        setField(term107301, term107301.getClass(), "compatibleCmVersion", "PWiSQlucVO");
        setField(term107301, term107301.getClass(), "lastPlayDate", "SkAkmjxoiu");
        setIntField(term107301, term107301.getClass(), "lastPlaceId", 1907000901);
        setField(term107301, term107301.getClass(), "lastPlaceName", "nQyRXiYkyU");
        setIntField(term107301, term107301.getClass(), "lastRegionId", -1160333442);
        setField(term107301, term107301.getClass(), "lastRegionName", "kpNIadQEnq");
        setIntField(term107301, term107301.getClass(), "lastAllNetId", 104572719);
        setField(term107301, term107301.getClass(), "lastClientId", "sLWXiUGWKR");
        setIntField(term107301, term107301.getClass(), "lastUsedDeckId", 1999151227);
        setIntField(term107301, term107301.getClass(), "lastPlayMusicLevel", 288964365);
        setIntField(term107301, term107301.getClass(), "lastEmoneyBrand", -586935630);
        setField(term107299, term107299.getClass(), "user", term107301);
        setIntField(term107299, term107299.getClass(), "itemKind", 833837720);
        setIntField(term107299, term107299.getClass(), "itemId", 640367895);
        setIntField(term107299, term107299.getClass(), "stock", -1613119246);
        setBooleanField(term107299, term107299.getClass(), "isValid", true);
        term107568 = new Integer(-580412864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107568;
        callMethod(klass, "setItemId", argTypes, term107299, args);
    }

};


