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

public class UserData_setNetBattle3rdCount_2008262036381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291019;
     Object term291096;

    public UserData_setNetBattle3rdCount_2008262036381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291019 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291019, term291019.getClass(), "id", 0L);
        setField(term291019, term291019.getClass(), "card", null);
        setField(term291019, term291019.getClass(), "userName", null);
        setIntField(term291019, term291019.getClass(), "level", 0);
        setIntField(term291019, term291019.getClass(), "reincarnationNum", 0);
        setField(term291019, term291019.getClass(), "exp", null);
        setLongField(term291019, term291019.getClass(), "point", 0L);
        setLongField(term291019, term291019.getClass(), "totalPoint", 0L);
        setIntField(term291019, term291019.getClass(), "playCount", 0);
        setIntField(term291019, term291019.getClass(), "multiPlayCount", 0);
        setIntField(term291019, term291019.getClass(), "playerRating", 0);
        setIntField(term291019, term291019.getClass(), "highestRating", 0);
        setIntField(term291019, term291019.getClass(), "nameplateId", 0);
        setIntField(term291019, term291019.getClass(), "frameId", 0);
        setIntField(term291019, term291019.getClass(), "characterId", 0);
        setIntField(term291019, term291019.getClass(), "trophyId", 0);
        setIntField(term291019, term291019.getClass(), "playedTutorialBit", 0);
        setIntField(term291019, term291019.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291019, term291019.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291019, term291019.getClass(), "totalMapNum", 0);
        setLongField(term291019, term291019.getClass(), "totalHiScore", 0L);
        setLongField(term291019, term291019.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291019, term291019.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291019, term291019.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291019, term291019.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291019, term291019.getClass(), "totalUltimaHighScore", 0L);
        setField(term291019, term291019.getClass(), "eventWatchedDate", null);
        setIntField(term291019, term291019.getClass(), "friendCount", 0);
        setField(term291019, term291019.getClass(), "firstGameId", null);
        setField(term291019, term291019.getClass(), "firstRomVersion", null);
        setField(term291019, term291019.getClass(), "firstDataVersion", null);
        setField(term291019, term291019.getClass(), "firstPlayDate", null);
        setField(term291019, term291019.getClass(), "lastGameId", null);
        setField(term291019, term291019.getClass(), "lastRomVersion", null);
        setField(term291019, term291019.getClass(), "lastDataVersion", null);
        setField(term291019, term291019.getClass(), "lastLoginDate", null);
        setField(term291019, term291019.getClass(), "lastPlayDate", null);
        setIntField(term291019, term291019.getClass(), "lastPlaceId", 0);
        setField(term291019, term291019.getClass(), "lastPlaceName", null);
        setField(term291019, term291019.getClass(), "lastRegionId", null);
        setField(term291019, term291019.getClass(), "lastRegionName", null);
        setField(term291019, term291019.getClass(), "lastAllNetId", null);
        setField(term291019, term291019.getClass(), "lastClientId", null);
        setField(term291019, term291019.getClass(), "lastCountryCode", null);
        setField(term291019, term291019.getClass(), "userNameEx", null);
        setField(term291019, term291019.getClass(), "compatibleCmVersion", null);
        setIntField(term291019, term291019.getClass(), "medal", 0);
        setIntField(term291019, term291019.getClass(), "mapIconId", 0);
        setIntField(term291019, term291019.getClass(), "voiceId", 0);
        setIntField(term291019, term291019.getClass(), "avatarWear", 0);
        setIntField(term291019, term291019.getClass(), "avatarHead", 0);
        setIntField(term291019, term291019.getClass(), "avatarFace", 0);
        setIntField(term291019, term291019.getClass(), "avatarSkin", 0);
        setIntField(term291019, term291019.getClass(), "avatarItem", 0);
        setIntField(term291019, term291019.getClass(), "avatarFront", 0);
        setIntField(term291019, term291019.getClass(), "avatarBack", 0);
        setIntField(term291019, term291019.getClass(), "classEmblemBase", 0);
        setIntField(term291019, term291019.getClass(), "classEmblemMedal", 0);
        setIntField(term291019, term291019.getClass(), "stockedGridCount", 0);
        setIntField(term291019, term291019.getClass(), "exMapLoopCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattlePlayCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattleWinCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattleLoseCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291019, term291019.getClass(), "charaIllustId", 0);
        setIntField(term291019, term291019.getClass(), "skillId", 0);
        setIntField(term291019, term291019.getClass(), "overPowerPoint", 0);
        setIntField(term291019, term291019.getClass(), "overPowerRate", 0);
        setIntField(term291019, term291019.getClass(), "overPowerLowerRank", 0);
        setIntField(term291019, term291019.getClass(), "avatarPoint", 0);
        setIntField(term291019, term291019.getClass(), "battleRankId", 0);
        setIntField(term291019, term291019.getClass(), "battleRankPoint", 0);
        setIntField(term291019, term291019.getClass(), "eliteRankPoint", 0);
        setIntField(term291019, term291019.getClass(), "netBattle1stCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattle2ndCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattle3rdCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattle4thCount", 0);
        setIntField(term291019, term291019.getClass(), "netBattleCorrection", 0);
        setIntField(term291019, term291019.getClass(), "netBattleErrCnt", 0);
        setIntField(term291019, term291019.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291019, term291019.getClass(), "battleRewardStatus", 0);
        setIntField(term291019, term291019.getClass(), "battleRewardIndex", 0);
        setIntField(term291019, term291019.getClass(), "battleRewardCount", 0);
        setIntField(term291019, term291019.getClass(), "ext1", 0);
        setIntField(term291019, term291019.getClass(), "ext2", 0);
        setIntField(term291019, term291019.getClass(), "ext3", 0);
        setIntField(term291019, term291019.getClass(), "ext4", 0);
        setIntField(term291019, term291019.getClass(), "ext5", 0);
        setIntField(term291019, term291019.getClass(), "ext6", 0);
        setIntField(term291019, term291019.getClass(), "ext7", 0);
        setIntField(term291019, term291019.getClass(), "ext8", 0);
        setIntField(term291019, term291019.getClass(), "ext9", 0);
        setIntField(term291019, term291019.getClass(), "ext10", 0);
        setField(term291019, term291019.getClass(), "extStr1", null);
        setField(term291019, term291019.getClass(), "extStr2", null);
        setLongField(term291019, term291019.getClass(), "extLong1", 0L);
        setLongField(term291019, term291019.getClass(), "extLong2", 0L);
        setField(term291019, term291019.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291019, term291019.getClass(), "isNetBattleHost", false);
        setIntField(term291019, term291019.getClass(), "netBattleEndState", 0);
        term291096 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291096;
        callMethod(klass, "setNetBattle3rdCount", argTypes, term291019, args);
    }

};


