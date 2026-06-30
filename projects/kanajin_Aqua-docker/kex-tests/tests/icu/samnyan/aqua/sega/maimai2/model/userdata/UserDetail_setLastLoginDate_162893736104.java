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

public class UserDetail_setLastLoginDate_162893736104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254078;

    public UserDetail_setLastLoginDate_162893736104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term254082 = new Long(2990264647913003810L);
        Integer term254145 = new Integer(-745063212);
        Integer term254147 = new Integer(298277204);
        Integer term254149 = new Integer(1536563217);
        Integer term254151 = new Integer(-449582867);
        Integer term254153 = new Integer(-650176523);
        Integer term254155 = new Integer(2071056240);
        Integer term254157 = new Integer(1894657425);
        Integer term254159 = new Integer(-263942209);
        ArrayList term254143 = new ArrayList();
        ((ArrayList) term254143).add(term254145);
        ((ArrayList) term254143).add(term254147);
        ((ArrayList) term254143).add(term254149);
        ((ArrayList) term254143).add(term254151);
        ((ArrayList) term254143).add(term254153);
        ((ArrayList) term254143).add(term254155);
        ((ArrayList) term254143).add(term254157);
        ((ArrayList) term254143).add(term254159);
        Integer term254165 = new Integer(820400430);
        Integer term254167 = new Integer(-1841078275);
        Integer term254169 = new Integer(-875421053);
        Integer term254171 = new Integer(212464780);
        Integer term254173 = new Integer(-1698447008);
        Integer term254175 = new Integer(1429592368);
        Integer term254177 = new Integer(-1997064536);
        Integer term254179 = new Integer(798438929);
        ArrayList term254163 = new ArrayList();
        ((ArrayList) term254163).add(term254165);
        ((ArrayList) term254163).add(term254167);
        ((ArrayList) term254163).add(term254169);
        ((ArrayList) term254163).add(term254171);
        ((ArrayList) term254163).add(term254173);
        ((ArrayList) term254163).add(term254175);
        ((ArrayList) term254163).add(term254177);
        ((ArrayList) term254163).add(term254179);
        term254078 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term254080 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term254096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254111 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term254078, term254078.getClass(), "id", -2932150496469152084L);
        setLongField(term254080, term254080.getClass(), "id", -7259009702298112138L);
        setField(term254080, term254080.getClass(), "extId", term254082);
        setField(term254080, term254080.getClass(), "luid", "ksdQQJdyNW");
        setIntField(term254097, term254097.getClass(), "year", 2012);
        setShortField(term254097, term254097.getClass(), "month", (short) 6);
        setShortField(term254097, term254097.getClass(), "day", (short) 1);
        setField(term254096, term254096.getClass(), "date", term254097);
        setByteField(term254101, term254101.getClass(), "hour", (byte) 14);
        setByteField(term254101, term254101.getClass(), "minute", (byte) 57);
        setByteField(term254101, term254101.getClass(), "second", (byte) 0);
        setIntField(term254101, term254101.getClass(), "nano", 965303069);
        setField(term254096, term254096.getClass(), "time", term254101);
        setField(term254080, term254080.getClass(), "registerTime", term254096);
        setIntField(term254107, term254107.getClass(), "year", 2027);
        setShortField(term254107, term254107.getClass(), "month", (short) 1);
        setShortField(term254107, term254107.getClass(), "day", (short) 31);
        setField(term254106, term254106.getClass(), "date", term254107);
        setByteField(term254111, term254111.getClass(), "hour", (byte) 16);
        setByteField(term254111, term254111.getClass(), "minute", (byte) 7);
        setByteField(term254111, term254111.getClass(), "second", (byte) 38);
        setIntField(term254111, term254111.getClass(), "nano", 713069905);
        setField(term254106, term254106.getClass(), "time", term254111);
        setField(term254080, term254080.getClass(), "accessTime", term254106);
        setField(term254078, term254078.getClass(), "card", term254080);
        setField(term254078, term254078.getClass(), "userName", "OMmpfwVAqq");
        setIntField(term254078, term254078.getClass(), "isNetMember", -1090929128);
        setIntField(term254078, term254078.getClass(), "iconId", -6828656);
        setIntField(term254078, term254078.getClass(), "plateId", 1326729269);
        setIntField(term254078, term254078.getClass(), "titleId", -1895397861);
        setIntField(term254078, term254078.getClass(), "partnerId", 1716602593);
        setIntField(term254078, term254078.getClass(), "frameId", 1259032686);
        setIntField(term254078, term254078.getClass(), "selectMapId", -753648604);
        setIntField(term254078, term254078.getClass(), "totalAwake", 389915231);
        setIntField(term254078, term254078.getClass(), "gradeRating", 804747162);
        setIntField(term254078, term254078.getClass(), "musicRating", -791466650);
        setIntField(term254078, term254078.getClass(), "playerRating", -523835907);
        setIntField(term254078, term254078.getClass(), "highestRating", 385209642);
        setIntField(term254078, term254078.getClass(), "gradeRank", -1815702004);
        setIntField(term254078, term254078.getClass(), "classRank", 1141075113);
        setIntField(term254078, term254078.getClass(), "courseRank", 1643922073);
        setField(term254078, term254078.getClass(), "charaSlot", term254143);
        setField(term254078, term254078.getClass(), "charaLockSlot", term254163);
        setLongField(term254078, term254078.getClass(), "contentBit", 7057503709209654076L);
        setIntField(term254078, term254078.getClass(), "playCount", -1512971740);
        setField(term254078, term254078.getClass(), "eventWatchedDate", "epjWinvtVU");
        setField(term254078, term254078.getClass(), "lastGameId", "UjaiuciVbk");
        setField(term254078, term254078.getClass(), "lastRomVersion", "RWHiRCpYTv");
        setField(term254078, term254078.getClass(), "lastDataVersion", "bkkYKGVZSl");
        setField(term254078, term254078.getClass(), "lastLoginDate", "zxSymDvdRR");
        setField(term254078, term254078.getClass(), "lastPlayDate", "vLzflhmVIO");
        setIntField(term254078, term254078.getClass(), "lastPlayCredit", 935946945);
        setIntField(term254078, term254078.getClass(), "lastPlayMode", -143105487);
        setIntField(term254078, term254078.getClass(), "lastPlaceId", 16612505);
        setField(term254078, term254078.getClass(), "lastPlaceName", "iclAYiudke");
        setIntField(term254078, term254078.getClass(), "lastAllNetId", 1873376410);
        setIntField(term254078, term254078.getClass(), "lastRegionId", -507501606);
        setField(term254078, term254078.getClass(), "lastRegionName", "cCwSyZEBIb");
        setField(term254078, term254078.getClass(), "lastClientId", "AtXchNEfAh");
        setField(term254078, term254078.getClass(), "lastCountryCode", "OfUGaofOyl");
        setIntField(term254078, term254078.getClass(), "lastSelectEMoney", 178633218);
        setIntField(term254078, term254078.getClass(), "lastSelectTicket", -2006303407);
        setIntField(term254078, term254078.getClass(), "lastSelectCourse", -1787834533);
        setIntField(term254078, term254078.getClass(), "lastCountCourse", 1502613791);
        setField(term254078, term254078.getClass(), "firstGameId", "hmqmJaPVoG");
        setField(term254078, term254078.getClass(), "firstRomVersion", "pNTxRrBYYn");
        setField(term254078, term254078.getClass(), "firstDataVersion", "EavfKjgzgQ");
        setField(term254078, term254078.getClass(), "firstPlayDate", "efyImakJaR");
        setField(term254078, term254078.getClass(), "compatibleCmVersion", "eryxzqFfFf");
        setField(term254078, term254078.getClass(), "dailyBonusDate", "aAFUdZslxJ");
        setField(term254078, term254078.getClass(), "dailyCourseBonusDate", "gMrywiVyIr");
        setField(term254078, term254078.getClass(), "lastPairLoginDate", "iyZjIacLsw");
        setField(term254078, term254078.getClass(), "lastTrialPlayDate", "vYkgboKVHZ");
        setIntField(term254078, term254078.getClass(), "playVsCount", -258767694);
        setIntField(term254078, term254078.getClass(), "playSyncCount", -1209689852);
        setIntField(term254078, term254078.getClass(), "winCount", 1861949155);
        setIntField(term254078, term254078.getClass(), "helpCount", -1997894313);
        setIntField(term254078, term254078.getClass(), "comboCount", -788461525);
        setLongField(term254078, term254078.getClass(), "totalDeluxscore", -1411326838937531130L);
        setLongField(term254078, term254078.getClass(), "totalBasicDeluxscore", -5597628323481569262L);
        setLongField(term254078, term254078.getClass(), "totalAdvancedDeluxscore", -3413460727271783379L);
        setLongField(term254078, term254078.getClass(), "totalExpertDeluxscore", 2281005994348867482L);
        setLongField(term254078, term254078.getClass(), "totalMasterDeluxscore", 7935287799944910045L);
        setLongField(term254078, term254078.getClass(), "totalReMasterDeluxscore", -5063865438376567533L);
        setIntField(term254078, term254078.getClass(), "totalSync", 1411975762);
        setIntField(term254078, term254078.getClass(), "totalBasicSync", -671901253);
        setIntField(term254078, term254078.getClass(), "totalAdvancedSync", -1402427175);
        setIntField(term254078, term254078.getClass(), "totalExpertSync", -455255888);
        setIntField(term254078, term254078.getClass(), "totalMasterSync", 1736913133);
        setIntField(term254078, term254078.getClass(), "totalReMasterSync", 80001823);
        setLongField(term254078, term254078.getClass(), "totalAchievement", 4378405141828434888L);
        setLongField(term254078, term254078.getClass(), "totalBasicAchievement", -3556381476610472081L);
        setLongField(term254078, term254078.getClass(), "totalAdvancedAchievement", -9011291151809046051L);
        setLongField(term254078, term254078.getClass(), "totalExpertAchievement", 5558367612217169533L);
        setLongField(term254078, term254078.getClass(), "totalMasterAchievement", -1981056274386005998L);
        setLongField(term254078, term254078.getClass(), "totalReMasterAchievement", -7206549361953251767L);
        setLongField(term254078, term254078.getClass(), "playerOldRating", -2077408996802686108L);
        setLongField(term254078, term254078.getClass(), "playerNewRating", 4747843105761344706L);
        setIntField(term254078, term254078.getClass(), "banState", -132224670);
        setLongField(term254078, term254078.getClass(), "dateTime", -3804104062705189605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IaGDRvnqIb";
        callMethod(klass, "setLastLoginDate", argTypes, term254078, args);
    }

};


