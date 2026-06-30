package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_setId_107435229820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96535;
     Object term96829;

    public UserMusicDetail_setId_107435229820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96541 = new Long(4795660804170399986L);
        term96535 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term96537 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term96539 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96570 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96696 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96697 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96701 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96747 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96535, term96535.getClass(), "id", 1720514282517245063L);
        setLongField(term96537, term96537.getClass(), "id", -1045336622757351064L);
        setLongField(term96539, term96539.getClass(), "id", -736341939344099077L);
        setField(term96539, term96539.getClass(), "extId", term96541);
        setField(term96539, term96539.getClass(), "luid", "TbzRSKYwZN");
        setIntField(term96556, term96556.getClass(), "year", 2011);
        setShortField(term96556, term96556.getClass(), "month", (short) 6);
        setShortField(term96556, term96556.getClass(), "day", (short) 18);
        setField(term96555, term96555.getClass(), "date", term96556);
        setByteField(term96560, term96560.getClass(), "hour", (byte) 18);
        setByteField(term96560, term96560.getClass(), "minute", (byte) 40);
        setByteField(term96560, term96560.getClass(), "second", (byte) 37);
        setIntField(term96560, term96560.getClass(), "nano", 623088445);
        setField(term96555, term96555.getClass(), "time", term96560);
        setField(term96539, term96539.getClass(), "registerTime", term96555);
        setIntField(term96566, term96566.getClass(), "year", 2027);
        setShortField(term96566, term96566.getClass(), "month", (short) 6);
        setShortField(term96566, term96566.getClass(), "day", (short) 19);
        setField(term96565, term96565.getClass(), "date", term96566);
        setByteField(term96570, term96570.getClass(), "hour", (byte) 16);
        setByteField(term96570, term96570.getClass(), "minute", (byte) 11);
        setByteField(term96570, term96570.getClass(), "second", (byte) 55);
        setIntField(term96570, term96570.getClass(), "nano", 573311540);
        setField(term96565, term96565.getClass(), "time", term96570);
        setField(term96539, term96539.getClass(), "accessTime", term96565);
        setField(term96537, term96537.getClass(), "card", term96539);
        setField(term96537, term96537.getClass(), "userName", "IMobeYICFK");
        setIntField(term96588, term96588.getClass(), "year", 2015);
        setShortField(term96588, term96588.getClass(), "month", (short) 3);
        setShortField(term96588, term96588.getClass(), "day", (short) 22);
        setField(term96587, term96587.getClass(), "date", term96588);
        setByteField(term96592, term96592.getClass(), "hour", (byte) 15);
        setByteField(term96592, term96592.getClass(), "minute", (byte) 25);
        setByteField(term96592, term96592.getClass(), "second", (byte) 0);
        setIntField(term96592, term96592.getClass(), "nano", 105149225);
        setField(term96587, term96587.getClass(), "time", term96592);
        setField(term96537, term96537.getClass(), "lastLoginDate", term96587);
        setBooleanField(term96537, term96537.getClass(), "isWebJoin", true);
        setField(term96537, term96537.getClass(), "webLimitDate", "HkkBqbwwlq");
        setIntField(term96537, term96537.getClass(), "level", -1853583675);
        setIntField(term96537, term96537.getClass(), "reincarnationNum", 2085299143);
        setField(term96537, term96537.getClass(), "exp", "iJCoKDwoAB");
        setLongField(term96537, term96537.getClass(), "point", -2070593800297942364L);
        setLongField(term96537, term96537.getClass(), "totalPoint", -7023621481714478007L);
        setIntField(term96537, term96537.getClass(), "playCount", 41805417);
        setIntField(term96537, term96537.getClass(), "multiPlayCount", 296055711);
        setIntField(term96537, term96537.getClass(), "multiWinCount", 465864250);
        setIntField(term96537, term96537.getClass(), "requestResCount", 941713404);
        setIntField(term96537, term96537.getClass(), "acceptResCount", 585296192);
        setIntField(term96537, term96537.getClass(), "successResCount", -2093946527);
        setIntField(term96537, term96537.getClass(), "playerRating", 312776664);
        setIntField(term96537, term96537.getClass(), "highestRating", 243025663);
        setIntField(term96537, term96537.getClass(), "nameplateId", -1565507430);
        setIntField(term96537, term96537.getClass(), "frameId", -1974437877);
        setIntField(term96537, term96537.getClass(), "characterId", -910087562);
        setIntField(term96537, term96537.getClass(), "trophyId", -478100700);
        setIntField(term96537, term96537.getClass(), "playedTutorialBit", -644350910);
        setIntField(term96537, term96537.getClass(), "firstTutorialCancelNum", 1392174755);
        setIntField(term96537, term96537.getClass(), "masterTutorialCancelNum", 542384961);
        setIntField(term96537, term96537.getClass(), "totalRepertoireCount", 821706893);
        setIntField(term96537, term96537.getClass(), "totalMapNum", -624144007);
        setLongField(term96537, term96537.getClass(), "totalHiScore", 4942278370983962653L);
        setLongField(term96537, term96537.getClass(), "totalBasicHighScore", 4497530590028813461L);
        setLongField(term96537, term96537.getClass(), "totalAdvancedHighScore", -3027046249023055574L);
        setLongField(term96537, term96537.getClass(), "totalExpertHighScore", 2253264840516591315L);
        setLongField(term96537, term96537.getClass(), "totalMasterHighScore", 7357901219511867751L);
        setIntField(term96649, term96649.getClass(), "year", 2027);
        setShortField(term96649, term96649.getClass(), "month", (short) 7);
        setShortField(term96649, term96649.getClass(), "day", (short) 29);
        setField(term96648, term96648.getClass(), "date", term96649);
        setByteField(term96653, term96653.getClass(), "hour", (byte) 16);
        setByteField(term96653, term96653.getClass(), "minute", (byte) 11);
        setByteField(term96653, term96653.getClass(), "second", (byte) 18);
        setIntField(term96653, term96653.getClass(), "nano", 191076740);
        setField(term96648, term96648.getClass(), "time", term96653);
        setField(term96537, term96537.getClass(), "eventWatchedDate", term96648);
        setIntField(term96537, term96537.getClass(), "friendCount", 869208951);
        setBooleanField(term96537, term96537.getClass(), "isMaimai", false);
        setField(term96537, term96537.getClass(), "firstGameId", "vmxQPAehpJ");
        setField(term96537, term96537.getClass(), "firstRomVersion", "xoFNyRpjCp");
        setField(term96537, term96537.getClass(), "firstDataVersion", "WPaMGzqiDs");
        setIntField(term96697, term96697.getClass(), "year", 2022);
        setShortField(term96697, term96697.getClass(), "month", (short) 11);
        setShortField(term96697, term96697.getClass(), "day", (short) 25);
        setField(term96696, term96696.getClass(), "date", term96697);
        setByteField(term96701, term96701.getClass(), "hour", (byte) 18);
        setByteField(term96701, term96701.getClass(), "minute", (byte) 57);
        setByteField(term96701, term96701.getClass(), "second", (byte) 3);
        setIntField(term96701, term96701.getClass(), "nano", 835421273);
        setField(term96696, term96696.getClass(), "time", term96701);
        setField(term96537, term96537.getClass(), "firstPlayDate", term96696);
        setField(term96537, term96537.getClass(), "lastGameId", "YtgjAWKCrQ");
        setField(term96537, term96537.getClass(), "lastRomVersion", "dVyyhFtNgV");
        setField(term96537, term96537.getClass(), "lastDataVersion", "YBBxUpUwzX");
        setIntField(term96743, term96743.getClass(), "year", 2014);
        setShortField(term96743, term96743.getClass(), "month", (short) 11);
        setShortField(term96743, term96743.getClass(), "day", (short) 22);
        setField(term96742, term96742.getClass(), "date", term96743);
        setByteField(term96747, term96747.getClass(), "hour", (byte) 15);
        setByteField(term96747, term96747.getClass(), "minute", (byte) 0);
        setByteField(term96747, term96747.getClass(), "second", (byte) 49);
        setIntField(term96747, term96747.getClass(), "nano", 252745625);
        setField(term96742, term96742.getClass(), "time", term96747);
        setField(term96537, term96537.getClass(), "lastPlayDate", term96742);
        setIntField(term96537, term96537.getClass(), "lastPlaceId", -1001034291);
        setField(term96537, term96537.getClass(), "lastPlaceName", "ZujOTiubuf");
        setField(term96537, term96537.getClass(), "lastRegionId", "groJdWOLGJ");
        setField(term96537, term96537.getClass(), "lastRegionName", "zzCCDeuyOo");
        setField(term96537, term96537.getClass(), "lastAllNetId", "ixrDOyTkCB");
        setField(term96537, term96537.getClass(), "lastClientId", "PvrMbFoCJF");
        setField(term96535, term96535.getClass(), "user", term96537);
        setIntField(term96535, term96535.getClass(), "musicId", -1612288598);
        setIntField(term96535, term96535.getClass(), "level", 1512583982);
        setIntField(term96535, term96535.getClass(), "playCount", 554400317);
        setIntField(term96535, term96535.getClass(), "scoreMax", 1771270508);
        setIntField(term96535, term96535.getClass(), "resRequestCount", 2025369602);
        setIntField(term96535, term96535.getClass(), "resAcceptCount", 1229764972);
        setIntField(term96535, term96535.getClass(), "resSuccessCount", -202016645);
        setIntField(term96535, term96535.getClass(), "missCount", -1135802429);
        setIntField(term96535, term96535.getClass(), "maxComboCount", -354346702);
        setBooleanField(term96535, term96535.getClass(), "isFullCombo", true);
        setBooleanField(term96535, term96535.getClass(), "isAllJustice", false);
        setBooleanField(term96535, term96535.getClass(), "isSuccess", true);
        setIntField(term96535, term96535.getClass(), "fullChain", -471266285);
        setIntField(term96535, term96535.getClass(), "maxChain", -1203375064);
        setIntField(term96535, term96535.getClass(), "scoreRank", -849622887);
        setBooleanField(term96535, term96535.getClass(), "isLock", false);
        term96829 = new Long(-5944574827460812990L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term96829;
        callMethod(klass, "setId", argTypes, term96535, args);
    }

};


