package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getLastPlayCredit_50292758328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4245386;

    public UserDetail_getLastPlayCredit_50292758328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4245390 = new Long(-6481664010461614336L);
        ArrayList term4245451 = new ArrayList();
        Integer term4245457 = new Integer(1241183529);
        Integer term4245459 = new Integer(825457585);
        Integer term4245461 = new Integer(-365689493);
        Integer term4245463 = new Integer(-1044364593);
        Integer term4245465 = new Integer(-1144558597);
        Integer term4245467 = new Integer(392267583);
        Integer term4245469 = new Integer(1712122682);
        Integer term4245471 = new Integer(-551874415);
        Integer term4245473 = new Integer(-966624066);
        ArrayList term4245455 = new ArrayList();
        ((ArrayList) term4245455).add(term4245457);
        ((ArrayList) term4245455).add(term4245459);
        ((ArrayList) term4245455).add(term4245461);
        ((ArrayList) term4245455).add(term4245463);
        ((ArrayList) term4245455).add(term4245465);
        ((ArrayList) term4245455).add(term4245467);
        ((ArrayList) term4245455).add(term4245469);
        ((ArrayList) term4245455).add(term4245471);
        ((ArrayList) term4245455).add(term4245473);
        term4245386 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4245388 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4245404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4245405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4245409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4245414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4245415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4245419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4245386, term4245386.getClass(), "id", 4588271454171106961L);
        setLongField(term4245388, term4245388.getClass(), "id", 2156584854892233138L);
        setField(term4245388, term4245388.getClass(), "extId", term4245390);
        setField(term4245388, term4245388.getClass(), "luid", "JbSgfBHSRq");
        setIntField(term4245405, term4245405.getClass(), "year", 2014);
        setShortField(term4245405, term4245405.getClass(), "month", (short) 1);
        setShortField(term4245405, term4245405.getClass(), "day", (short) 17);
        setField(term4245404, term4245404.getClass(), "date", term4245405);
        setByteField(term4245409, term4245409.getClass(), "hour", (byte) 22);
        setByteField(term4245409, term4245409.getClass(), "minute", (byte) 48);
        setByteField(term4245409, term4245409.getClass(), "second", (byte) 57);
        setIntField(term4245409, term4245409.getClass(), "nano", 585726111);
        setField(term4245404, term4245404.getClass(), "time", term4245409);
        setField(term4245388, term4245388.getClass(), "registerTime", term4245404);
        setIntField(term4245415, term4245415.getClass(), "year", 2024);
        setShortField(term4245415, term4245415.getClass(), "month", (short) 12);
        setShortField(term4245415, term4245415.getClass(), "day", (short) 28);
        setField(term4245414, term4245414.getClass(), "date", term4245415);
        setByteField(term4245419, term4245419.getClass(), "hour", (byte) 5);
        setByteField(term4245419, term4245419.getClass(), "minute", (byte) 35);
        setByteField(term4245419, term4245419.getClass(), "second", (byte) 44);
        setIntField(term4245419, term4245419.getClass(), "nano", 512989458);
        setField(term4245414, term4245414.getClass(), "time", term4245419);
        setField(term4245388, term4245388.getClass(), "accessTime", term4245414);
        setField(term4245386, term4245386.getClass(), "card", term4245388);
        setField(term4245386, term4245386.getClass(), "userName", "QPvUyZOqab");
        setIntField(term4245386, term4245386.getClass(), "isNetMember", -2007540143);
        setIntField(term4245386, term4245386.getClass(), "iconId", -1710863545);
        setIntField(term4245386, term4245386.getClass(), "plateId", -240019595);
        setIntField(term4245386, term4245386.getClass(), "titleId", 1032518979);
        setIntField(term4245386, term4245386.getClass(), "partnerId", 1410530416);
        setIntField(term4245386, term4245386.getClass(), "frameId", 1711921612);
        setIntField(term4245386, term4245386.getClass(), "selectMapId", 1986660590);
        setIntField(term4245386, term4245386.getClass(), "totalAwake", -1627031510);
        setIntField(term4245386, term4245386.getClass(), "gradeRating", -807101070);
        setIntField(term4245386, term4245386.getClass(), "musicRating", -1079089567);
        setIntField(term4245386, term4245386.getClass(), "playerRating", -680601361);
        setIntField(term4245386, term4245386.getClass(), "highestRating", -1934476345);
        setIntField(term4245386, term4245386.getClass(), "gradeRank", -441031818);
        setIntField(term4245386, term4245386.getClass(), "classRank", -1280305705);
        setIntField(term4245386, term4245386.getClass(), "courseRank", -1236614439);
        setField(term4245386, term4245386.getClass(), "charaSlot", term4245451);
        setField(term4245386, term4245386.getClass(), "charaLockSlot", term4245455);
        setLongField(term4245386, term4245386.getClass(), "contentBit", -8821273281049272558L);
        setIntField(term4245386, term4245386.getClass(), "playCount", -1131673079);
        setField(term4245386, term4245386.getClass(), "eventWatchedDate", "RkJEzKfVfF");
        setField(term4245386, term4245386.getClass(), "lastGameId", "ZBWwTlwaKt");
        setField(term4245386, term4245386.getClass(), "lastRomVersion", "ylPuenAXsp");
        setField(term4245386, term4245386.getClass(), "lastDataVersion", "rEKtavAQiA");
        setField(term4245386, term4245386.getClass(), "lastLoginDate", "yFoOHCdJqd");
        setField(term4245386, term4245386.getClass(), "lastPlayDate", "aQsUhGyVQN");
        setIntField(term4245386, term4245386.getClass(), "lastPlayCredit", 527073393);
        setIntField(term4245386, term4245386.getClass(), "lastPlayMode", -291026761);
        setIntField(term4245386, term4245386.getClass(), "lastPlaceId", -1757585554);
        setField(term4245386, term4245386.getClass(), "lastPlaceName", "csMtzOpfgs");
        setIntField(term4245386, term4245386.getClass(), "lastAllNetId", -1230020519);
        setIntField(term4245386, term4245386.getClass(), "lastRegionId", -993020587);
        setField(term4245386, term4245386.getClass(), "lastRegionName", "JZvKivTySg");
        setField(term4245386, term4245386.getClass(), "lastClientId", "zuybuxLdkC");
        setField(term4245386, term4245386.getClass(), "lastCountryCode", "RUuiFXRgnB");
        setIntField(term4245386, term4245386.getClass(), "lastSelectEMoney", -1785916007);
        setIntField(term4245386, term4245386.getClass(), "lastSelectTicket", -1258638697);
        setIntField(term4245386, term4245386.getClass(), "lastSelectCourse", -1074271215);
        setIntField(term4245386, term4245386.getClass(), "lastCountCourse", 708583279);
        setField(term4245386, term4245386.getClass(), "firstGameId", "eXGApVwRUI");
        setField(term4245386, term4245386.getClass(), "firstRomVersion", "xanxbtOAEZ");
        setField(term4245386, term4245386.getClass(), "firstDataVersion", "HbBjKwDifG");
        setField(term4245386, term4245386.getClass(), "firstPlayDate", "oAIwXhAkun");
        setField(term4245386, term4245386.getClass(), "compatibleCmVersion", "kDOHEydSLn");
        setField(term4245386, term4245386.getClass(), "dailyBonusDate", "XAAySsEKhO");
        setField(term4245386, term4245386.getClass(), "dailyCourseBonusDate", "OULRweGkNR");
        setField(term4245386, term4245386.getClass(), "lastPairLoginDate", "TexplnpCDz");
        setField(term4245386, term4245386.getClass(), "lastTrialPlayDate", "QtyMhRUIsg");
        setIntField(term4245386, term4245386.getClass(), "playVsCount", -497249099);
        setIntField(term4245386, term4245386.getClass(), "playSyncCount", -1615900319);
        setIntField(term4245386, term4245386.getClass(), "winCount", -862170577);
        setIntField(term4245386, term4245386.getClass(), "helpCount", 607975440);
        setIntField(term4245386, term4245386.getClass(), "comboCount", 793039034);
        setLongField(term4245386, term4245386.getClass(), "totalDeluxscore", 6060024492918309044L);
        setLongField(term4245386, term4245386.getClass(), "totalBasicDeluxscore", 813393672536281749L);
        setLongField(term4245386, term4245386.getClass(), "totalAdvancedDeluxscore", -2553482824544337655L);
        setLongField(term4245386, term4245386.getClass(), "totalExpertDeluxscore", -1233344241761163544L);
        setLongField(term4245386, term4245386.getClass(), "totalMasterDeluxscore", -3352262085128542785L);
        setLongField(term4245386, term4245386.getClass(), "totalReMasterDeluxscore", 7383021973028405871L);
        setIntField(term4245386, term4245386.getClass(), "totalSync", -1156422584);
        setIntField(term4245386, term4245386.getClass(), "totalBasicSync", 1787969093);
        setIntField(term4245386, term4245386.getClass(), "totalAdvancedSync", 445655663);
        setIntField(term4245386, term4245386.getClass(), "totalExpertSync", 768110814);
        setIntField(term4245386, term4245386.getClass(), "totalMasterSync", 1277102520);
        setIntField(term4245386, term4245386.getClass(), "totalReMasterSync", 1907354804);
        setLongField(term4245386, term4245386.getClass(), "totalAchievement", -6386253054416278828L);
        setLongField(term4245386, term4245386.getClass(), "totalBasicAchievement", -3067130916134322834L);
        setLongField(term4245386, term4245386.getClass(), "totalAdvancedAchievement", -7192584971225621984L);
        setLongField(term4245386, term4245386.getClass(), "totalExpertAchievement", -205372476367701114L);
        setLongField(term4245386, term4245386.getClass(), "totalMasterAchievement", -7819728498038019471L);
        setLongField(term4245386, term4245386.getClass(), "totalReMasterAchievement", 2646727607603222912L);
        setLongField(term4245386, term4245386.getClass(), "playerOldRating", 6067401583258871L);
        setLongField(term4245386, term4245386.getClass(), "playerNewRating", 5059337915033039689L);
        setIntField(term4245386, term4245386.getClass(), "banState", -1467554867);
        setLongField(term4245386, term4245386.getClass(), "dateTime", 739311791664229602L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayCredit", argTypes, term4245386, args);
    }

};


