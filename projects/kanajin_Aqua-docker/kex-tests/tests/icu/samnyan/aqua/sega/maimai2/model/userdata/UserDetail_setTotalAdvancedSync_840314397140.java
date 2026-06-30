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

public class UserDetail_setTotalAdvancedSync_840314397140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4309467;
     Object term4309818;

    public UserDetail_setTotalAdvancedSync_840314397140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4309471 = new Long(-381737772463044732L);
        Integer term4309534 = new Integer(425460974);
        Integer term4309536 = new Integer(-405289097);
        Integer term4309538 = new Integer(-1702410002);
        Integer term4309540 = new Integer(1231954187);
        ArrayList term4309532 = new ArrayList();
        ((ArrayList) term4309532).add(term4309534);
        ((ArrayList) term4309532).add(term4309536);
        ((ArrayList) term4309532).add(term4309538);
        ((ArrayList) term4309532).add(term4309540);
        Integer term4309546 = new Integer(804645296);
        Integer term4309548 = new Integer(-1460116142);
        ArrayList term4309544 = new ArrayList();
        ((ArrayList) term4309544).add(term4309546);
        ((ArrayList) term4309544).add(term4309548);
        term4309467 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4309469 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4309485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4309486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4309490 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4309495 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4309496 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4309500 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4309467, term4309467.getClass(), "id", -995025199858039700L);
        setLongField(term4309469, term4309469.getClass(), "id", -5977846408055271996L);
        setField(term4309469, term4309469.getClass(), "extId", term4309471);
        setField(term4309469, term4309469.getClass(), "luid", "bgTnTEPehb");
        setIntField(term4309486, term4309486.getClass(), "year", 2023);
        setShortField(term4309486, term4309486.getClass(), "month", (short) 3);
        setShortField(term4309486, term4309486.getClass(), "day", (short) 15);
        setField(term4309485, term4309485.getClass(), "date", term4309486);
        setByteField(term4309490, term4309490.getClass(), "hour", (byte) 4);
        setByteField(term4309490, term4309490.getClass(), "minute", (byte) 5);
        setByteField(term4309490, term4309490.getClass(), "second", (byte) 17);
        setIntField(term4309490, term4309490.getClass(), "nano", 277386161);
        setField(term4309485, term4309485.getClass(), "time", term4309490);
        setField(term4309469, term4309469.getClass(), "registerTime", term4309485);
        setIntField(term4309496, term4309496.getClass(), "year", 2022);
        setShortField(term4309496, term4309496.getClass(), "month", (short) 2);
        setShortField(term4309496, term4309496.getClass(), "day", (short) 3);
        setField(term4309495, term4309495.getClass(), "date", term4309496);
        setByteField(term4309500, term4309500.getClass(), "hour", (byte) 20);
        setByteField(term4309500, term4309500.getClass(), "minute", (byte) 53);
        setByteField(term4309500, term4309500.getClass(), "second", (byte) 35);
        setIntField(term4309500, term4309500.getClass(), "nano", 591067708);
        setField(term4309495, term4309495.getClass(), "time", term4309500);
        setField(term4309469, term4309469.getClass(), "accessTime", term4309495);
        setField(term4309467, term4309467.getClass(), "card", term4309469);
        setField(term4309467, term4309467.getClass(), "userName", "qcLgqAlEgt");
        setIntField(term4309467, term4309467.getClass(), "isNetMember", 64158701);
        setIntField(term4309467, term4309467.getClass(), "iconId", -598385939);
        setIntField(term4309467, term4309467.getClass(), "plateId", 1387131071);
        setIntField(term4309467, term4309467.getClass(), "titleId", -445895769);
        setIntField(term4309467, term4309467.getClass(), "partnerId", 1235045905);
        setIntField(term4309467, term4309467.getClass(), "frameId", -1673692038);
        setIntField(term4309467, term4309467.getClass(), "selectMapId", 790776608);
        setIntField(term4309467, term4309467.getClass(), "totalAwake", 366191674);
        setIntField(term4309467, term4309467.getClass(), "gradeRating", -371629516);
        setIntField(term4309467, term4309467.getClass(), "musicRating", 738470661);
        setIntField(term4309467, term4309467.getClass(), "playerRating", -270958139);
        setIntField(term4309467, term4309467.getClass(), "highestRating", 1640518087);
        setIntField(term4309467, term4309467.getClass(), "gradeRank", -232354325);
        setIntField(term4309467, term4309467.getClass(), "classRank", 2124649008);
        setIntField(term4309467, term4309467.getClass(), "courseRank", 2140339469);
        setField(term4309467, term4309467.getClass(), "charaSlot", term4309532);
        setField(term4309467, term4309467.getClass(), "charaLockSlot", term4309544);
        setLongField(term4309467, term4309467.getClass(), "contentBit", 1367765739179907649L);
        setIntField(term4309467, term4309467.getClass(), "playCount", -581309449);
        setField(term4309467, term4309467.getClass(), "eventWatchedDate", "kfQYTPPoSF");
        setField(term4309467, term4309467.getClass(), "lastGameId", "PLcUhIUSRH");
        setField(term4309467, term4309467.getClass(), "lastRomVersion", "UzrZXtJLRL");
        setField(term4309467, term4309467.getClass(), "lastDataVersion", "eWdSFfkRnh");
        setField(term4309467, term4309467.getClass(), "lastLoginDate", "pxXoBZEyjR");
        setField(term4309467, term4309467.getClass(), "lastPlayDate", "GNEtVIGZom");
        setIntField(term4309467, term4309467.getClass(), "lastPlayCredit", -995895057);
        setIntField(term4309467, term4309467.getClass(), "lastPlayMode", -498723483);
        setIntField(term4309467, term4309467.getClass(), "lastPlaceId", 565949832);
        setField(term4309467, term4309467.getClass(), "lastPlaceName", "IISxstHBMo");
        setIntField(term4309467, term4309467.getClass(), "lastAllNetId", 1376053371);
        setIntField(term4309467, term4309467.getClass(), "lastRegionId", -379956921);
        setField(term4309467, term4309467.getClass(), "lastRegionName", "ZqmuKcuPuU");
        setField(term4309467, term4309467.getClass(), "lastClientId", "KZPgtpVTJv");
        setField(term4309467, term4309467.getClass(), "lastCountryCode", "rENIUDfwfC");
        setIntField(term4309467, term4309467.getClass(), "lastSelectEMoney", 2069134125);
        setIntField(term4309467, term4309467.getClass(), "lastSelectTicket", 1540628153);
        setIntField(term4309467, term4309467.getClass(), "lastSelectCourse", -1800173432);
        setIntField(term4309467, term4309467.getClass(), "lastCountCourse", -1649017434);
        setField(term4309467, term4309467.getClass(), "firstGameId", "fKoRAniwLq");
        setField(term4309467, term4309467.getClass(), "firstRomVersion", "uGvfuHYAzs");
        setField(term4309467, term4309467.getClass(), "firstDataVersion", "EMGEQzNXXC");
        setField(term4309467, term4309467.getClass(), "firstPlayDate", "DZShlRgZZk");
        setField(term4309467, term4309467.getClass(), "compatibleCmVersion", "drhNyWwEkk");
        setField(term4309467, term4309467.getClass(), "dailyBonusDate", "NjfoBVpisV");
        setField(term4309467, term4309467.getClass(), "dailyCourseBonusDate", "MwoAQoGzKP");
        setField(term4309467, term4309467.getClass(), "lastPairLoginDate", "dLOQZQxjhd");
        setField(term4309467, term4309467.getClass(), "lastTrialPlayDate", "ouKylCIgoT");
        setIntField(term4309467, term4309467.getClass(), "playVsCount", 820705730);
        setIntField(term4309467, term4309467.getClass(), "playSyncCount", -1123845603);
        setIntField(term4309467, term4309467.getClass(), "winCount", -608319102);
        setIntField(term4309467, term4309467.getClass(), "helpCount", 1655771665);
        setIntField(term4309467, term4309467.getClass(), "comboCount", -977667870);
        setLongField(term4309467, term4309467.getClass(), "totalDeluxscore", -1065122816729007847L);
        setLongField(term4309467, term4309467.getClass(), "totalBasicDeluxscore", 1578742699177021111L);
        setLongField(term4309467, term4309467.getClass(), "totalAdvancedDeluxscore", 4956992174162435760L);
        setLongField(term4309467, term4309467.getClass(), "totalExpertDeluxscore", -5858045901386606342L);
        setLongField(term4309467, term4309467.getClass(), "totalMasterDeluxscore", 7740557768763918036L);
        setLongField(term4309467, term4309467.getClass(), "totalReMasterDeluxscore", 401820626666229238L);
        setIntField(term4309467, term4309467.getClass(), "totalSync", -346106260);
        setIntField(term4309467, term4309467.getClass(), "totalBasicSync", 2049649911);
        setIntField(term4309467, term4309467.getClass(), "totalAdvancedSync", -1100264764);
        setIntField(term4309467, term4309467.getClass(), "totalExpertSync", -1018127131);
        setIntField(term4309467, term4309467.getClass(), "totalMasterSync", 1510620958);
        setIntField(term4309467, term4309467.getClass(), "totalReMasterSync", -2110485554);
        setLongField(term4309467, term4309467.getClass(), "totalAchievement", -5225016654016903938L);
        setLongField(term4309467, term4309467.getClass(), "totalBasicAchievement", -1889122253005090243L);
        setLongField(term4309467, term4309467.getClass(), "totalAdvancedAchievement", 6739801511292425811L);
        setLongField(term4309467, term4309467.getClass(), "totalExpertAchievement", -5277352922826586578L);
        setLongField(term4309467, term4309467.getClass(), "totalMasterAchievement", -746935109039578000L);
        setLongField(term4309467, term4309467.getClass(), "totalReMasterAchievement", -7476562949276987310L);
        setLongField(term4309467, term4309467.getClass(), "playerOldRating", -5851048539213369238L);
        setLongField(term4309467, term4309467.getClass(), "playerNewRating", 4234404926151764489L);
        setIntField(term4309467, term4309467.getClass(), "banState", -585002666);
        setLongField(term4309467, term4309467.getClass(), "dateTime", 3018246968321763856L);
        term4309818 = new Integer(-149131502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4309818;
        callMethod(klass, "setTotalAdvancedSync", argTypes, term4309467, args);
    }

};


