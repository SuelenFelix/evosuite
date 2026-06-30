package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setExt4_177745852392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291888;
     Object term291965;

    public UserData_setExt4_177745852392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291888 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291888, term291888.getClass(), "id", 0L);
        setField(term291888, term291888.getClass(), "card", null);
        setField(term291888, term291888.getClass(), "userName", null);
        setIntField(term291888, term291888.getClass(), "level", 0);
        setIntField(term291888, term291888.getClass(), "reincarnationNum", 0);
        setField(term291888, term291888.getClass(), "exp", null);
        setLongField(term291888, term291888.getClass(), "point", 0L);
        setLongField(term291888, term291888.getClass(), "totalPoint", 0L);
        setIntField(term291888, term291888.getClass(), "playCount", 0);
        setIntField(term291888, term291888.getClass(), "multiPlayCount", 0);
        setIntField(term291888, term291888.getClass(), "playerRating", 0);
        setIntField(term291888, term291888.getClass(), "highestRating", 0);
        setIntField(term291888, term291888.getClass(), "nameplateId", 0);
        setIntField(term291888, term291888.getClass(), "frameId", 0);
        setIntField(term291888, term291888.getClass(), "characterId", 0);
        setIntField(term291888, term291888.getClass(), "trophyId", 0);
        setIntField(term291888, term291888.getClass(), "playedTutorialBit", 0);
        setIntField(term291888, term291888.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291888, term291888.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291888, term291888.getClass(), "totalMapNum", 0);
        setLongField(term291888, term291888.getClass(), "totalHiScore", 0L);
        setLongField(term291888, term291888.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291888, term291888.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291888, term291888.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291888, term291888.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291888, term291888.getClass(), "totalUltimaHighScore", 0L);
        setField(term291888, term291888.getClass(), "eventWatchedDate", null);
        setIntField(term291888, term291888.getClass(), "friendCount", 0);
        setField(term291888, term291888.getClass(), "firstGameId", null);
        setField(term291888, term291888.getClass(), "firstRomVersion", null);
        setField(term291888, term291888.getClass(), "firstDataVersion", null);
        setField(term291888, term291888.getClass(), "firstPlayDate", null);
        setField(term291888, term291888.getClass(), "lastGameId", null);
        setField(term291888, term291888.getClass(), "lastRomVersion", null);
        setField(term291888, term291888.getClass(), "lastDataVersion", null);
        setField(term291888, term291888.getClass(), "lastLoginDate", null);
        setField(term291888, term291888.getClass(), "lastPlayDate", null);
        setIntField(term291888, term291888.getClass(), "lastPlaceId", 0);
        setField(term291888, term291888.getClass(), "lastPlaceName", null);
        setField(term291888, term291888.getClass(), "lastRegionId", null);
        setField(term291888, term291888.getClass(), "lastRegionName", null);
        setField(term291888, term291888.getClass(), "lastAllNetId", null);
        setField(term291888, term291888.getClass(), "lastClientId", null);
        setField(term291888, term291888.getClass(), "lastCountryCode", null);
        setField(term291888, term291888.getClass(), "userNameEx", null);
        setField(term291888, term291888.getClass(), "compatibleCmVersion", null);
        setIntField(term291888, term291888.getClass(), "medal", 0);
        setIntField(term291888, term291888.getClass(), "mapIconId", 0);
        setIntField(term291888, term291888.getClass(), "voiceId", 0);
        setIntField(term291888, term291888.getClass(), "avatarWear", 0);
        setIntField(term291888, term291888.getClass(), "avatarHead", 0);
        setIntField(term291888, term291888.getClass(), "avatarFace", 0);
        setIntField(term291888, term291888.getClass(), "avatarSkin", 0);
        setIntField(term291888, term291888.getClass(), "avatarItem", 0);
        setIntField(term291888, term291888.getClass(), "avatarFront", 0);
        setIntField(term291888, term291888.getClass(), "avatarBack", 0);
        setIntField(term291888, term291888.getClass(), "classEmblemBase", 0);
        setIntField(term291888, term291888.getClass(), "classEmblemMedal", 0);
        setIntField(term291888, term291888.getClass(), "stockedGridCount", 0);
        setIntField(term291888, term291888.getClass(), "exMapLoopCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattlePlayCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattleWinCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattleLoseCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291888, term291888.getClass(), "charaIllustId", 0);
        setIntField(term291888, term291888.getClass(), "skillId", 0);
        setIntField(term291888, term291888.getClass(), "overPowerPoint", 0);
        setIntField(term291888, term291888.getClass(), "overPowerRate", 0);
        setIntField(term291888, term291888.getClass(), "overPowerLowerRank", 0);
        setIntField(term291888, term291888.getClass(), "avatarPoint", 0);
        setIntField(term291888, term291888.getClass(), "battleRankId", 0);
        setIntField(term291888, term291888.getClass(), "battleRankPoint", 0);
        setIntField(term291888, term291888.getClass(), "eliteRankPoint", 0);
        setIntField(term291888, term291888.getClass(), "netBattle1stCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattle2ndCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattle3rdCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattle4thCount", 0);
        setIntField(term291888, term291888.getClass(), "netBattleCorrection", 0);
        setIntField(term291888, term291888.getClass(), "netBattleErrCnt", 0);
        setIntField(term291888, term291888.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291888, term291888.getClass(), "battleRewardStatus", 0);
        setIntField(term291888, term291888.getClass(), "battleRewardIndex", 0);
        setIntField(term291888, term291888.getClass(), "battleRewardCount", 0);
        setIntField(term291888, term291888.getClass(), "ext1", 0);
        setIntField(term291888, term291888.getClass(), "ext2", 0);
        setIntField(term291888, term291888.getClass(), "ext3", 0);
        setIntField(term291888, term291888.getClass(), "ext4", 0);
        setIntField(term291888, term291888.getClass(), "ext5", 0);
        setIntField(term291888, term291888.getClass(), "ext6", 0);
        setIntField(term291888, term291888.getClass(), "ext7", 0);
        setIntField(term291888, term291888.getClass(), "ext8", 0);
        setIntField(term291888, term291888.getClass(), "ext9", 0);
        setIntField(term291888, term291888.getClass(), "ext10", 0);
        setField(term291888, term291888.getClass(), "extStr1", null);
        setField(term291888, term291888.getClass(), "extStr2", null);
        setLongField(term291888, term291888.getClass(), "extLong1", 0L);
        setLongField(term291888, term291888.getClass(), "extLong2", 0L);
        setField(term291888, term291888.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291888, term291888.getClass(), "isNetBattleHost", false);
        setIntField(term291888, term291888.getClass(), "netBattleEndState", 0);
        term291965 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291965;
        callMethod(klass, "setExt4", argTypes, term291888, args);
    }

};


