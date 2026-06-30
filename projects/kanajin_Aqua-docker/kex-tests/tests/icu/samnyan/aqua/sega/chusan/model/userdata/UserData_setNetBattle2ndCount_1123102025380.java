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

public class UserData_setNetBattle2ndCount_1123102025380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290940;
     Object term291017;

    public UserData_setNetBattle2ndCount_1123102025380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290940 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290940, term290940.getClass(), "id", 0L);
        setField(term290940, term290940.getClass(), "card", null);
        setField(term290940, term290940.getClass(), "userName", null);
        setIntField(term290940, term290940.getClass(), "level", 0);
        setIntField(term290940, term290940.getClass(), "reincarnationNum", 0);
        setField(term290940, term290940.getClass(), "exp", null);
        setLongField(term290940, term290940.getClass(), "point", 0L);
        setLongField(term290940, term290940.getClass(), "totalPoint", 0L);
        setIntField(term290940, term290940.getClass(), "playCount", 0);
        setIntField(term290940, term290940.getClass(), "multiPlayCount", 0);
        setIntField(term290940, term290940.getClass(), "playerRating", 0);
        setIntField(term290940, term290940.getClass(), "highestRating", 0);
        setIntField(term290940, term290940.getClass(), "nameplateId", 0);
        setIntField(term290940, term290940.getClass(), "frameId", 0);
        setIntField(term290940, term290940.getClass(), "characterId", 0);
        setIntField(term290940, term290940.getClass(), "trophyId", 0);
        setIntField(term290940, term290940.getClass(), "playedTutorialBit", 0);
        setIntField(term290940, term290940.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290940, term290940.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290940, term290940.getClass(), "totalMapNum", 0);
        setLongField(term290940, term290940.getClass(), "totalHiScore", 0L);
        setLongField(term290940, term290940.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290940, term290940.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290940, term290940.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290940, term290940.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290940, term290940.getClass(), "totalUltimaHighScore", 0L);
        setField(term290940, term290940.getClass(), "eventWatchedDate", null);
        setIntField(term290940, term290940.getClass(), "friendCount", 0);
        setField(term290940, term290940.getClass(), "firstGameId", null);
        setField(term290940, term290940.getClass(), "firstRomVersion", null);
        setField(term290940, term290940.getClass(), "firstDataVersion", null);
        setField(term290940, term290940.getClass(), "firstPlayDate", null);
        setField(term290940, term290940.getClass(), "lastGameId", null);
        setField(term290940, term290940.getClass(), "lastRomVersion", null);
        setField(term290940, term290940.getClass(), "lastDataVersion", null);
        setField(term290940, term290940.getClass(), "lastLoginDate", null);
        setField(term290940, term290940.getClass(), "lastPlayDate", null);
        setIntField(term290940, term290940.getClass(), "lastPlaceId", 0);
        setField(term290940, term290940.getClass(), "lastPlaceName", null);
        setField(term290940, term290940.getClass(), "lastRegionId", null);
        setField(term290940, term290940.getClass(), "lastRegionName", null);
        setField(term290940, term290940.getClass(), "lastAllNetId", null);
        setField(term290940, term290940.getClass(), "lastClientId", null);
        setField(term290940, term290940.getClass(), "lastCountryCode", null);
        setField(term290940, term290940.getClass(), "userNameEx", null);
        setField(term290940, term290940.getClass(), "compatibleCmVersion", null);
        setIntField(term290940, term290940.getClass(), "medal", 0);
        setIntField(term290940, term290940.getClass(), "mapIconId", 0);
        setIntField(term290940, term290940.getClass(), "voiceId", 0);
        setIntField(term290940, term290940.getClass(), "avatarWear", 0);
        setIntField(term290940, term290940.getClass(), "avatarHead", 0);
        setIntField(term290940, term290940.getClass(), "avatarFace", 0);
        setIntField(term290940, term290940.getClass(), "avatarSkin", 0);
        setIntField(term290940, term290940.getClass(), "avatarItem", 0);
        setIntField(term290940, term290940.getClass(), "avatarFront", 0);
        setIntField(term290940, term290940.getClass(), "avatarBack", 0);
        setIntField(term290940, term290940.getClass(), "classEmblemBase", 0);
        setIntField(term290940, term290940.getClass(), "classEmblemMedal", 0);
        setIntField(term290940, term290940.getClass(), "stockedGridCount", 0);
        setIntField(term290940, term290940.getClass(), "exMapLoopCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattlePlayCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattleWinCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattleLoseCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290940, term290940.getClass(), "charaIllustId", 0);
        setIntField(term290940, term290940.getClass(), "skillId", 0);
        setIntField(term290940, term290940.getClass(), "overPowerPoint", 0);
        setIntField(term290940, term290940.getClass(), "overPowerRate", 0);
        setIntField(term290940, term290940.getClass(), "overPowerLowerRank", 0);
        setIntField(term290940, term290940.getClass(), "avatarPoint", 0);
        setIntField(term290940, term290940.getClass(), "battleRankId", 0);
        setIntField(term290940, term290940.getClass(), "battleRankPoint", 0);
        setIntField(term290940, term290940.getClass(), "eliteRankPoint", 0);
        setIntField(term290940, term290940.getClass(), "netBattle1stCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattle2ndCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattle3rdCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattle4thCount", 0);
        setIntField(term290940, term290940.getClass(), "netBattleCorrection", 0);
        setIntField(term290940, term290940.getClass(), "netBattleErrCnt", 0);
        setIntField(term290940, term290940.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290940, term290940.getClass(), "battleRewardStatus", 0);
        setIntField(term290940, term290940.getClass(), "battleRewardIndex", 0);
        setIntField(term290940, term290940.getClass(), "battleRewardCount", 0);
        setIntField(term290940, term290940.getClass(), "ext1", 0);
        setIntField(term290940, term290940.getClass(), "ext2", 0);
        setIntField(term290940, term290940.getClass(), "ext3", 0);
        setIntField(term290940, term290940.getClass(), "ext4", 0);
        setIntField(term290940, term290940.getClass(), "ext5", 0);
        setIntField(term290940, term290940.getClass(), "ext6", 0);
        setIntField(term290940, term290940.getClass(), "ext7", 0);
        setIntField(term290940, term290940.getClass(), "ext8", 0);
        setIntField(term290940, term290940.getClass(), "ext9", 0);
        setIntField(term290940, term290940.getClass(), "ext10", 0);
        setField(term290940, term290940.getClass(), "extStr1", null);
        setField(term290940, term290940.getClass(), "extStr2", null);
        setLongField(term290940, term290940.getClass(), "extLong1", 0L);
        setLongField(term290940, term290940.getClass(), "extLong2", 0L);
        setField(term290940, term290940.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290940, term290940.getClass(), "isNetBattleHost", false);
        setIntField(term290940, term290940.getClass(), "netBattleEndState", 0);
        term291017 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291017;
        callMethod(klass, "setNetBattle2ndCount", argTypes, term290940, args);
    }

};


