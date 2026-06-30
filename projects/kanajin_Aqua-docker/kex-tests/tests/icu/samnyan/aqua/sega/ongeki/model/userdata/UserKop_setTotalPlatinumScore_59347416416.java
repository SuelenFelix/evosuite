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

public class UserKop_setTotalPlatinumScore_59347416416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278728;
     Object term279022;

    public UserKop_setTotalPlatinumScore_59347416416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278734 = new Long(1964822153944985001L);
        term278728 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term278730 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term278732 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278763 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278728, term278728.getClass(), "id", 1035184291996615628L);
        setLongField(term278730, term278730.getClass(), "id", 381941593846330628L);
        setLongField(term278732, term278732.getClass(), "id", 7305826469715869983L);
        setField(term278732, term278732.getClass(), "extId", term278734);
        setField(term278732, term278732.getClass(), "luid", "rWAlzFyhnR");
        setIntField(term278749, term278749.getClass(), "year", 2013);
        setShortField(term278749, term278749.getClass(), "month", (short) 2);
        setShortField(term278749, term278749.getClass(), "day", (short) 28);
        setField(term278748, term278748.getClass(), "date", term278749);
        setByteField(term278753, term278753.getClass(), "hour", (byte) 15);
        setByteField(term278753, term278753.getClass(), "minute", (byte) 22);
        setByteField(term278753, term278753.getClass(), "second", (byte) 42);
        setIntField(term278753, term278753.getClass(), "nano", 337740978);
        setField(term278748, term278748.getClass(), "time", term278753);
        setField(term278732, term278732.getClass(), "registerTime", term278748);
        setIntField(term278759, term278759.getClass(), "year", 2014);
        setShortField(term278759, term278759.getClass(), "month", (short) 1);
        setShortField(term278759, term278759.getClass(), "day", (short) 2);
        setField(term278758, term278758.getClass(), "date", term278759);
        setByteField(term278763, term278763.getClass(), "hour", (byte) 21);
        setByteField(term278763, term278763.getClass(), "minute", (byte) 53);
        setByteField(term278763, term278763.getClass(), "second", (byte) 5);
        setIntField(term278763, term278763.getClass(), "nano", 277705791);
        setField(term278758, term278758.getClass(), "time", term278763);
        setField(term278732, term278732.getClass(), "accessTime", term278758);
        setField(term278730, term278730.getClass(), "card", term278732);
        setField(term278730, term278730.getClass(), "userName", "LphHrPlrqn");
        setIntField(term278730, term278730.getClass(), "level", -1098356486);
        setIntField(term278730, term278730.getClass(), "reincarnationNum", 686906286);
        setLongField(term278730, term278730.getClass(), "exp", 5437985982644107546L);
        setLongField(term278730, term278730.getClass(), "point", 3291518710212116700L);
        setLongField(term278730, term278730.getClass(), "totalPoint", -270807304746600247L);
        setIntField(term278730, term278730.getClass(), "playCount", -1692759265);
        setIntField(term278730, term278730.getClass(), "jewelCount", -744124449);
        setIntField(term278730, term278730.getClass(), "totalJewelCount", 1671330839);
        setIntField(term278730, term278730.getClass(), "medalCount", 1727775801);
        setIntField(term278730, term278730.getClass(), "playerRating", -825889815);
        setIntField(term278730, term278730.getClass(), "highestRating", -1914563192);
        setIntField(term278730, term278730.getClass(), "battlePoint", 31438099);
        setIntField(term278730, term278730.getClass(), "bestBattlePoint", -1594165729);
        setIntField(term278730, term278730.getClass(), "overDamageBattlePoint", 1815043014);
        setBooleanField(term278730, term278730.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term278730, term278730.getClass(), "nameplateId", 706656437);
        setIntField(term278730, term278730.getClass(), "trophyId", -1367051681);
        setIntField(term278730, term278730.getClass(), "cardId", -1124721171);
        setIntField(term278730, term278730.getClass(), "characterId", -1269067895);
        setIntField(term278730, term278730.getClass(), "characterVoiceNo", 1439808726);
        setIntField(term278730, term278730.getClass(), "tabSetting", -243491664);
        setIntField(term278730, term278730.getClass(), "tabSortSetting", -2015048732);
        setIntField(term278730, term278730.getClass(), "cardCategorySetting", -1898608719);
        setIntField(term278730, term278730.getClass(), "cardSortSetting", -1343791309);
        setIntField(term278730, term278730.getClass(), "rivalScoreCategorySetting", 1549394146);
        setIntField(term278730, term278730.getClass(), "playedTutorialBit", 2107404816);
        setIntField(term278730, term278730.getClass(), "firstTutorialCancelNum", -1685899538);
        setLongField(term278730, term278730.getClass(), "sumTechHighScore", -5327772887080514038L);
        setLongField(term278730, term278730.getClass(), "sumTechBasicHighScore", -324332089203589093L);
        setLongField(term278730, term278730.getClass(), "sumTechAdvancedHighScore", 1950750625043836572L);
        setLongField(term278730, term278730.getClass(), "sumTechExpertHighScore", 1026584969137750142L);
        setLongField(term278730, term278730.getClass(), "sumTechMasterHighScore", -8727211245529612809L);
        setLongField(term278730, term278730.getClass(), "sumTechLunaticHighScore", 5075956868162459884L);
        setLongField(term278730, term278730.getClass(), "sumBattleHighScore", -508924396560569422L);
        setLongField(term278730, term278730.getClass(), "sumBattleBasicHighScore", -3133500101108859828L);
        setLongField(term278730, term278730.getClass(), "sumBattleAdvancedHighScore", 9113419520368452252L);
        setLongField(term278730, term278730.getClass(), "sumBattleExpertHighScore", 1085977630858091032L);
        setLongField(term278730, term278730.getClass(), "sumBattleMasterHighScore", -2488674004751279102L);
        setLongField(term278730, term278730.getClass(), "sumBattleLunaticHighScore", -2514397971875680961L);
        setField(term278730, term278730.getClass(), "eventWatchedDate", "qQfbGGlBUn");
        setField(term278730, term278730.getClass(), "cmEventWatchedDate", "nulHgoDPRO");
        setField(term278730, term278730.getClass(), "firstGameId", "jiQYJRpWWs");
        setField(term278730, term278730.getClass(), "firstRomVersion", "UaGWyukANs");
        setField(term278730, term278730.getClass(), "firstDataVersion", "XHgoSKsgYP");
        setField(term278730, term278730.getClass(), "firstPlayDate", "iQPdAhoTek");
        setField(term278730, term278730.getClass(), "lastGameId", "IBmkVoFQfR");
        setField(term278730, term278730.getClass(), "lastRomVersion", "fvqExLyjOZ");
        setField(term278730, term278730.getClass(), "lastDataVersion", "XkzjjKogww");
        setField(term278730, term278730.getClass(), "compatibleCmVersion", "twjymkvbft");
        setField(term278730, term278730.getClass(), "lastPlayDate", "YwLqpBnVFV");
        setIntField(term278730, term278730.getClass(), "lastPlaceId", 1737970975);
        setField(term278730, term278730.getClass(), "lastPlaceName", "brGgmTeuRs");
        setIntField(term278730, term278730.getClass(), "lastRegionId", 1787372569);
        setField(term278730, term278730.getClass(), "lastRegionName", "zMLmSyuwNB");
        setIntField(term278730, term278730.getClass(), "lastAllNetId", 684666777);
        setField(term278730, term278730.getClass(), "lastClientId", "QtjqcVtEVk");
        setIntField(term278730, term278730.getClass(), "lastUsedDeckId", 1178569956);
        setIntField(term278730, term278730.getClass(), "lastPlayMusicLevel", -547915411);
        setIntField(term278730, term278730.getClass(), "lastEmoneyBrand", 1768724009);
        setField(term278728, term278728.getClass(), "user", term278730);
        setField(term278728, term278728.getClass(), "authKey", "KggRnGvBBV");
        setIntField(term278728, term278728.getClass(), "kopId", 249265496);
        setIntField(term278728, term278728.getClass(), "areaId", 868477230);
        setIntField(term278728, term278728.getClass(), "totalTechScore", 1229413667);
        setIntField(term278728, term278728.getClass(), "totalPlatinumScore", 874120759);
        setField(term278728, term278728.getClass(), "techRecordDate", "xqIPePiGzm");
        setBooleanField(term278728, term278728.getClass(), "isTotalTechNewRecord", false);
        term279022 = new Integer(-552497235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term279022;
        callMethod(klass, "setTotalPlatinumScore", argTypes, term278728, args);
    }

};


