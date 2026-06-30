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

public class UserData_setExt2_177747774390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291730;
     Object term291807;

    public UserData_setExt2_177747774390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291730 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291730, term291730.getClass(), "id", 0L);
        setField(term291730, term291730.getClass(), "card", null);
        setField(term291730, term291730.getClass(), "userName", null);
        setIntField(term291730, term291730.getClass(), "level", 0);
        setIntField(term291730, term291730.getClass(), "reincarnationNum", 0);
        setField(term291730, term291730.getClass(), "exp", null);
        setLongField(term291730, term291730.getClass(), "point", 0L);
        setLongField(term291730, term291730.getClass(), "totalPoint", 0L);
        setIntField(term291730, term291730.getClass(), "playCount", 0);
        setIntField(term291730, term291730.getClass(), "multiPlayCount", 0);
        setIntField(term291730, term291730.getClass(), "playerRating", 0);
        setIntField(term291730, term291730.getClass(), "highestRating", 0);
        setIntField(term291730, term291730.getClass(), "nameplateId", 0);
        setIntField(term291730, term291730.getClass(), "frameId", 0);
        setIntField(term291730, term291730.getClass(), "characterId", 0);
        setIntField(term291730, term291730.getClass(), "trophyId", 0);
        setIntField(term291730, term291730.getClass(), "playedTutorialBit", 0);
        setIntField(term291730, term291730.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291730, term291730.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291730, term291730.getClass(), "totalMapNum", 0);
        setLongField(term291730, term291730.getClass(), "totalHiScore", 0L);
        setLongField(term291730, term291730.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291730, term291730.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291730, term291730.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291730, term291730.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291730, term291730.getClass(), "totalUltimaHighScore", 0L);
        setField(term291730, term291730.getClass(), "eventWatchedDate", null);
        setIntField(term291730, term291730.getClass(), "friendCount", 0);
        setField(term291730, term291730.getClass(), "firstGameId", null);
        setField(term291730, term291730.getClass(), "firstRomVersion", null);
        setField(term291730, term291730.getClass(), "firstDataVersion", null);
        setField(term291730, term291730.getClass(), "firstPlayDate", null);
        setField(term291730, term291730.getClass(), "lastGameId", null);
        setField(term291730, term291730.getClass(), "lastRomVersion", null);
        setField(term291730, term291730.getClass(), "lastDataVersion", null);
        setField(term291730, term291730.getClass(), "lastLoginDate", null);
        setField(term291730, term291730.getClass(), "lastPlayDate", null);
        setIntField(term291730, term291730.getClass(), "lastPlaceId", 0);
        setField(term291730, term291730.getClass(), "lastPlaceName", null);
        setField(term291730, term291730.getClass(), "lastRegionId", null);
        setField(term291730, term291730.getClass(), "lastRegionName", null);
        setField(term291730, term291730.getClass(), "lastAllNetId", null);
        setField(term291730, term291730.getClass(), "lastClientId", null);
        setField(term291730, term291730.getClass(), "lastCountryCode", null);
        setField(term291730, term291730.getClass(), "userNameEx", null);
        setField(term291730, term291730.getClass(), "compatibleCmVersion", null);
        setIntField(term291730, term291730.getClass(), "medal", 0);
        setIntField(term291730, term291730.getClass(), "mapIconId", 0);
        setIntField(term291730, term291730.getClass(), "voiceId", 0);
        setIntField(term291730, term291730.getClass(), "avatarWear", 0);
        setIntField(term291730, term291730.getClass(), "avatarHead", 0);
        setIntField(term291730, term291730.getClass(), "avatarFace", 0);
        setIntField(term291730, term291730.getClass(), "avatarSkin", 0);
        setIntField(term291730, term291730.getClass(), "avatarItem", 0);
        setIntField(term291730, term291730.getClass(), "avatarFront", 0);
        setIntField(term291730, term291730.getClass(), "avatarBack", 0);
        setIntField(term291730, term291730.getClass(), "classEmblemBase", 0);
        setIntField(term291730, term291730.getClass(), "classEmblemMedal", 0);
        setIntField(term291730, term291730.getClass(), "stockedGridCount", 0);
        setIntField(term291730, term291730.getClass(), "exMapLoopCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattlePlayCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattleWinCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattleLoseCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291730, term291730.getClass(), "charaIllustId", 0);
        setIntField(term291730, term291730.getClass(), "skillId", 0);
        setIntField(term291730, term291730.getClass(), "overPowerPoint", 0);
        setIntField(term291730, term291730.getClass(), "overPowerRate", 0);
        setIntField(term291730, term291730.getClass(), "overPowerLowerRank", 0);
        setIntField(term291730, term291730.getClass(), "avatarPoint", 0);
        setIntField(term291730, term291730.getClass(), "battleRankId", 0);
        setIntField(term291730, term291730.getClass(), "battleRankPoint", 0);
        setIntField(term291730, term291730.getClass(), "eliteRankPoint", 0);
        setIntField(term291730, term291730.getClass(), "netBattle1stCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattle2ndCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattle3rdCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattle4thCount", 0);
        setIntField(term291730, term291730.getClass(), "netBattleCorrection", 0);
        setIntField(term291730, term291730.getClass(), "netBattleErrCnt", 0);
        setIntField(term291730, term291730.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291730, term291730.getClass(), "battleRewardStatus", 0);
        setIntField(term291730, term291730.getClass(), "battleRewardIndex", 0);
        setIntField(term291730, term291730.getClass(), "battleRewardCount", 0);
        setIntField(term291730, term291730.getClass(), "ext1", 0);
        setIntField(term291730, term291730.getClass(), "ext2", 0);
        setIntField(term291730, term291730.getClass(), "ext3", 0);
        setIntField(term291730, term291730.getClass(), "ext4", 0);
        setIntField(term291730, term291730.getClass(), "ext5", 0);
        setIntField(term291730, term291730.getClass(), "ext6", 0);
        setIntField(term291730, term291730.getClass(), "ext7", 0);
        setIntField(term291730, term291730.getClass(), "ext8", 0);
        setIntField(term291730, term291730.getClass(), "ext9", 0);
        setIntField(term291730, term291730.getClass(), "ext10", 0);
        setField(term291730, term291730.getClass(), "extStr1", null);
        setField(term291730, term291730.getClass(), "extStr2", null);
        setLongField(term291730, term291730.getClass(), "extLong1", 0L);
        setLongField(term291730, term291730.getClass(), "extLong2", 0L);
        setField(term291730, term291730.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291730, term291730.getClass(), "isNetBattleHost", false);
        setIntField(term291730, term291730.getClass(), "netBattleEndState", 0);
        term291807 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291807;
        callMethod(klass, "setExt2", argTypes, term291730, args);
    }

};


