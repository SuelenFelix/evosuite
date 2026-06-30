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

public class UserData_setExt3_177746813391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291809;
     Object term291886;

    public UserData_setExt3_177746813391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291809 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291809, term291809.getClass(), "id", 0L);
        setField(term291809, term291809.getClass(), "card", null);
        setField(term291809, term291809.getClass(), "userName", null);
        setIntField(term291809, term291809.getClass(), "level", 0);
        setIntField(term291809, term291809.getClass(), "reincarnationNum", 0);
        setField(term291809, term291809.getClass(), "exp", null);
        setLongField(term291809, term291809.getClass(), "point", 0L);
        setLongField(term291809, term291809.getClass(), "totalPoint", 0L);
        setIntField(term291809, term291809.getClass(), "playCount", 0);
        setIntField(term291809, term291809.getClass(), "multiPlayCount", 0);
        setIntField(term291809, term291809.getClass(), "playerRating", 0);
        setIntField(term291809, term291809.getClass(), "highestRating", 0);
        setIntField(term291809, term291809.getClass(), "nameplateId", 0);
        setIntField(term291809, term291809.getClass(), "frameId", 0);
        setIntField(term291809, term291809.getClass(), "characterId", 0);
        setIntField(term291809, term291809.getClass(), "trophyId", 0);
        setIntField(term291809, term291809.getClass(), "playedTutorialBit", 0);
        setIntField(term291809, term291809.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291809, term291809.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291809, term291809.getClass(), "totalMapNum", 0);
        setLongField(term291809, term291809.getClass(), "totalHiScore", 0L);
        setLongField(term291809, term291809.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291809, term291809.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291809, term291809.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291809, term291809.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291809, term291809.getClass(), "totalUltimaHighScore", 0L);
        setField(term291809, term291809.getClass(), "eventWatchedDate", null);
        setIntField(term291809, term291809.getClass(), "friendCount", 0);
        setField(term291809, term291809.getClass(), "firstGameId", null);
        setField(term291809, term291809.getClass(), "firstRomVersion", null);
        setField(term291809, term291809.getClass(), "firstDataVersion", null);
        setField(term291809, term291809.getClass(), "firstPlayDate", null);
        setField(term291809, term291809.getClass(), "lastGameId", null);
        setField(term291809, term291809.getClass(), "lastRomVersion", null);
        setField(term291809, term291809.getClass(), "lastDataVersion", null);
        setField(term291809, term291809.getClass(), "lastLoginDate", null);
        setField(term291809, term291809.getClass(), "lastPlayDate", null);
        setIntField(term291809, term291809.getClass(), "lastPlaceId", 0);
        setField(term291809, term291809.getClass(), "lastPlaceName", null);
        setField(term291809, term291809.getClass(), "lastRegionId", null);
        setField(term291809, term291809.getClass(), "lastRegionName", null);
        setField(term291809, term291809.getClass(), "lastAllNetId", null);
        setField(term291809, term291809.getClass(), "lastClientId", null);
        setField(term291809, term291809.getClass(), "lastCountryCode", null);
        setField(term291809, term291809.getClass(), "userNameEx", null);
        setField(term291809, term291809.getClass(), "compatibleCmVersion", null);
        setIntField(term291809, term291809.getClass(), "medal", 0);
        setIntField(term291809, term291809.getClass(), "mapIconId", 0);
        setIntField(term291809, term291809.getClass(), "voiceId", 0);
        setIntField(term291809, term291809.getClass(), "avatarWear", 0);
        setIntField(term291809, term291809.getClass(), "avatarHead", 0);
        setIntField(term291809, term291809.getClass(), "avatarFace", 0);
        setIntField(term291809, term291809.getClass(), "avatarSkin", 0);
        setIntField(term291809, term291809.getClass(), "avatarItem", 0);
        setIntField(term291809, term291809.getClass(), "avatarFront", 0);
        setIntField(term291809, term291809.getClass(), "avatarBack", 0);
        setIntField(term291809, term291809.getClass(), "classEmblemBase", 0);
        setIntField(term291809, term291809.getClass(), "classEmblemMedal", 0);
        setIntField(term291809, term291809.getClass(), "stockedGridCount", 0);
        setIntField(term291809, term291809.getClass(), "exMapLoopCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattlePlayCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattleWinCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattleLoseCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291809, term291809.getClass(), "charaIllustId", 0);
        setIntField(term291809, term291809.getClass(), "skillId", 0);
        setIntField(term291809, term291809.getClass(), "overPowerPoint", 0);
        setIntField(term291809, term291809.getClass(), "overPowerRate", 0);
        setIntField(term291809, term291809.getClass(), "overPowerLowerRank", 0);
        setIntField(term291809, term291809.getClass(), "avatarPoint", 0);
        setIntField(term291809, term291809.getClass(), "battleRankId", 0);
        setIntField(term291809, term291809.getClass(), "battleRankPoint", 0);
        setIntField(term291809, term291809.getClass(), "eliteRankPoint", 0);
        setIntField(term291809, term291809.getClass(), "netBattle1stCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattle2ndCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattle3rdCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattle4thCount", 0);
        setIntField(term291809, term291809.getClass(), "netBattleCorrection", 0);
        setIntField(term291809, term291809.getClass(), "netBattleErrCnt", 0);
        setIntField(term291809, term291809.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291809, term291809.getClass(), "battleRewardStatus", 0);
        setIntField(term291809, term291809.getClass(), "battleRewardIndex", 0);
        setIntField(term291809, term291809.getClass(), "battleRewardCount", 0);
        setIntField(term291809, term291809.getClass(), "ext1", 0);
        setIntField(term291809, term291809.getClass(), "ext2", 0);
        setIntField(term291809, term291809.getClass(), "ext3", 0);
        setIntField(term291809, term291809.getClass(), "ext4", 0);
        setIntField(term291809, term291809.getClass(), "ext5", 0);
        setIntField(term291809, term291809.getClass(), "ext6", 0);
        setIntField(term291809, term291809.getClass(), "ext7", 0);
        setIntField(term291809, term291809.getClass(), "ext8", 0);
        setIntField(term291809, term291809.getClass(), "ext9", 0);
        setIntField(term291809, term291809.getClass(), "ext10", 0);
        setField(term291809, term291809.getClass(), "extStr1", null);
        setField(term291809, term291809.getClass(), "extStr2", null);
        setLongField(term291809, term291809.getClass(), "extLong1", 0L);
        setLongField(term291809, term291809.getClass(), "extLong2", 0L);
        setField(term291809, term291809.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291809, term291809.getClass(), "isNetBattleHost", false);
        setIntField(term291809, term291809.getClass(), "netBattleEndState", 0);
        term291886 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291886;
        callMethod(klass, "setExt3", argTypes, term291809, args);
    }

};


