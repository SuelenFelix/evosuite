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

public class UserDetail_setLastAllNetId_1312411699110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257550;
     Object term257915;

    public UserDetail_setLastAllNetId_1312411699110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term257554 = new Long(-599981502351912419L);
        Integer term257617 = new Integer(-1945165354);
        Integer term257619 = new Integer(14341670);
        Integer term257621 = new Integer(-144022361);
        Integer term257623 = new Integer(-1419212893);
        Integer term257625 = new Integer(-457189882);
        Integer term257627 = new Integer(-1227023001);
        ArrayList term257615 = new ArrayList();
        ((ArrayList) term257615).add(term257617);
        ((ArrayList) term257615).add(term257619);
        ((ArrayList) term257615).add(term257621);
        ((ArrayList) term257615).add(term257623);
        ((ArrayList) term257615).add(term257625);
        ((ArrayList) term257615).add(term257627);
        Integer term257633 = new Integer(-622827471);
        Integer term257635 = new Integer(-1759579486);
        Integer term257637 = new Integer(147748970);
        Integer term257639 = new Integer(-459525196);
        Integer term257641 = new Integer(2129073623);
        Integer term257643 = new Integer(-1623896406);
        Integer term257645 = new Integer(-1767855347);
        ArrayList term257631 = new ArrayList();
        ((ArrayList) term257631).add(term257633);
        ((ArrayList) term257631).add(term257635);
        ((ArrayList) term257631).add(term257637);
        ((ArrayList) term257631).add(term257639);
        ((ArrayList) term257631).add(term257641);
        ((ArrayList) term257631).add(term257643);
        ((ArrayList) term257631).add(term257645);
        term257550 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term257552 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term257568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257573 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257583 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term257550, term257550.getClass(), "id", 4624943688495209296L);
        setLongField(term257552, term257552.getClass(), "id", -4430722967405374865L);
        setField(term257552, term257552.getClass(), "extId", term257554);
        setField(term257552, term257552.getClass(), "luid", "ClJWxuFhvY");
        setIntField(term257569, term257569.getClass(), "year", 2028);
        setShortField(term257569, term257569.getClass(), "month", (short) 12);
        setShortField(term257569, term257569.getClass(), "day", (short) 5);
        setField(term257568, term257568.getClass(), "date", term257569);
        setByteField(term257573, term257573.getClass(), "hour", (byte) 0);
        setByteField(term257573, term257573.getClass(), "minute", (byte) 4);
        setByteField(term257573, term257573.getClass(), "second", (byte) 24);
        setIntField(term257573, term257573.getClass(), "nano", 25841507);
        setField(term257568, term257568.getClass(), "time", term257573);
        setField(term257552, term257552.getClass(), "registerTime", term257568);
        setIntField(term257579, term257579.getClass(), "year", 2012);
        setShortField(term257579, term257579.getClass(), "month", (short) 2);
        setShortField(term257579, term257579.getClass(), "day", (short) 25);
        setField(term257578, term257578.getClass(), "date", term257579);
        setByteField(term257583, term257583.getClass(), "hour", (byte) 23);
        setByteField(term257583, term257583.getClass(), "minute", (byte) 35);
        setByteField(term257583, term257583.getClass(), "second", (byte) 51);
        setIntField(term257583, term257583.getClass(), "nano", 181227985);
        setField(term257578, term257578.getClass(), "time", term257583);
        setField(term257552, term257552.getClass(), "accessTime", term257578);
        setField(term257550, term257550.getClass(), "card", term257552);
        setField(term257550, term257550.getClass(), "userName", "owPqnSCjlr");
        setIntField(term257550, term257550.getClass(), "isNetMember", 495648720);
        setIntField(term257550, term257550.getClass(), "iconId", -1601485867);
        setIntField(term257550, term257550.getClass(), "plateId", 1998131577);
        setIntField(term257550, term257550.getClass(), "titleId", -796385132);
        setIntField(term257550, term257550.getClass(), "partnerId", 764130450);
        setIntField(term257550, term257550.getClass(), "frameId", 88245264);
        setIntField(term257550, term257550.getClass(), "selectMapId", 1442828973);
        setIntField(term257550, term257550.getClass(), "totalAwake", 935972072);
        setIntField(term257550, term257550.getClass(), "gradeRating", 150265946);
        setIntField(term257550, term257550.getClass(), "musicRating", 1626027490);
        setIntField(term257550, term257550.getClass(), "playerRating", -1464025625);
        setIntField(term257550, term257550.getClass(), "highestRating", 2015899963);
        setIntField(term257550, term257550.getClass(), "gradeRank", 679633464);
        setIntField(term257550, term257550.getClass(), "classRank", 696207020);
        setIntField(term257550, term257550.getClass(), "courseRank", -764517409);
        setField(term257550, term257550.getClass(), "charaSlot", term257615);
        setField(term257550, term257550.getClass(), "charaLockSlot", term257631);
        setLongField(term257550, term257550.getClass(), "contentBit", -7789740144037953814L);
        setIntField(term257550, term257550.getClass(), "playCount", -1031341811);
        setField(term257550, term257550.getClass(), "eventWatchedDate", "bstKSThCsH");
        setField(term257550, term257550.getClass(), "lastGameId", "QuJUFXGoAL");
        setField(term257550, term257550.getClass(), "lastRomVersion", "NHyvoceYPA");
        setField(term257550, term257550.getClass(), "lastDataVersion", "zvfYpTBhsN");
        setField(term257550, term257550.getClass(), "lastLoginDate", "SInylFGlyL");
        setField(term257550, term257550.getClass(), "lastPlayDate", "vTqdPzKttw");
        setIntField(term257550, term257550.getClass(), "lastPlayCredit", 1746547938);
        setIntField(term257550, term257550.getClass(), "lastPlayMode", -1990552588);
        setIntField(term257550, term257550.getClass(), "lastPlaceId", 866467788);
        setField(term257550, term257550.getClass(), "lastPlaceName", "UaULhxzYkE");
        setIntField(term257550, term257550.getClass(), "lastAllNetId", -309416237);
        setIntField(term257550, term257550.getClass(), "lastRegionId", -1872979717);
        setField(term257550, term257550.getClass(), "lastRegionName", "DkwiMryAQU");
        setField(term257550, term257550.getClass(), "lastClientId", "mVdlxSSqUp");
        setField(term257550, term257550.getClass(), "lastCountryCode", "uLrjpWhGzA");
        setIntField(term257550, term257550.getClass(), "lastSelectEMoney", 1715864149);
        setIntField(term257550, term257550.getClass(), "lastSelectTicket", -508840627);
        setIntField(term257550, term257550.getClass(), "lastSelectCourse", -207704563);
        setIntField(term257550, term257550.getClass(), "lastCountCourse", -661250152);
        setField(term257550, term257550.getClass(), "firstGameId", "vwfIkOlVZd");
        setField(term257550, term257550.getClass(), "firstRomVersion", "MceqIBCmbY");
        setField(term257550, term257550.getClass(), "firstDataVersion", "rlUBuxBZan");
        setField(term257550, term257550.getClass(), "firstPlayDate", "xcfVTYHLJQ");
        setField(term257550, term257550.getClass(), "compatibleCmVersion", "pcqiKdOHBV");
        setField(term257550, term257550.getClass(), "dailyBonusDate", "rXuZuSwWYH");
        setField(term257550, term257550.getClass(), "dailyCourseBonusDate", "dxRMTzPEIm");
        setField(term257550, term257550.getClass(), "lastPairLoginDate", "HXmJcdlvRm");
        setField(term257550, term257550.getClass(), "lastTrialPlayDate", "SIFtikilxs");
        setIntField(term257550, term257550.getClass(), "playVsCount", 1420332983);
        setIntField(term257550, term257550.getClass(), "playSyncCount", 682985613);
        setIntField(term257550, term257550.getClass(), "winCount", 2335384);
        setIntField(term257550, term257550.getClass(), "helpCount", -2073470721);
        setIntField(term257550, term257550.getClass(), "comboCount", 1081791680);
        setLongField(term257550, term257550.getClass(), "totalDeluxscore", 7495148833839974844L);
        setLongField(term257550, term257550.getClass(), "totalBasicDeluxscore", -3151619145835660154L);
        setLongField(term257550, term257550.getClass(), "totalAdvancedDeluxscore", -615305132334082895L);
        setLongField(term257550, term257550.getClass(), "totalExpertDeluxscore", -6222492840703428507L);
        setLongField(term257550, term257550.getClass(), "totalMasterDeluxscore", -4848977483031815468L);
        setLongField(term257550, term257550.getClass(), "totalReMasterDeluxscore", 2100985294388649841L);
        setIntField(term257550, term257550.getClass(), "totalSync", 818689185);
        setIntField(term257550, term257550.getClass(), "totalBasicSync", 1510353216);
        setIntField(term257550, term257550.getClass(), "totalAdvancedSync", 2040409009);
        setIntField(term257550, term257550.getClass(), "totalExpertSync", 778873226);
        setIntField(term257550, term257550.getClass(), "totalMasterSync", -88095693);
        setIntField(term257550, term257550.getClass(), "totalReMasterSync", 1745511833);
        setLongField(term257550, term257550.getClass(), "totalAchievement", -2972203237880727553L);
        setLongField(term257550, term257550.getClass(), "totalBasicAchievement", -9167302788579041371L);
        setLongField(term257550, term257550.getClass(), "totalAdvancedAchievement", 8452692418775893349L);
        setLongField(term257550, term257550.getClass(), "totalExpertAchievement", 8029034886926074539L);
        setLongField(term257550, term257550.getClass(), "totalMasterAchievement", -7166174464227217710L);
        setLongField(term257550, term257550.getClass(), "totalReMasterAchievement", -3920426427349414202L);
        setLongField(term257550, term257550.getClass(), "playerOldRating", -96242696166926282L);
        setLongField(term257550, term257550.getClass(), "playerNewRating", -8660581989794655758L);
        setIntField(term257550, term257550.getClass(), "banState", -186574934);
        setLongField(term257550, term257550.getClass(), "dateTime", -2392114960471042205L);
        term257915 = new Integer(41148822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257915;
        callMethod(klass, "setLastAllNetId", argTypes, term257550, args);
    }

};


