package com.murali.alphabetsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	 private MediaPlayer mp;
	View a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.imageButtonA);
        b=findViewById(R.id.imageButtonB);
        c=findViewById(R.id.imageButtonC);
        d=findViewById(R.id.imageButtonD);
        e=findViewById(R.id.imageButtonE);
        f=findViewById(R.id.imageButtonF);
        g=findViewById(R.id.imageButtonG);
        h=findViewById(R.id.imageButtonH);
        i=findViewById(R.id.imageButtonI);
        j=findViewById(R.id.imageButtonJ);
        k=findViewById(R.id.imageButtonK);
        l=findViewById(R.id.imageButtonL);
        m=findViewById(R.id.imageButtonM);
        n=findViewById(R.id.imageButtonN);
        o=findViewById(R.id.imageButtonO);
        p=findViewById(R.id.imageButtonP);
        q=findViewById(R.id.imageButtonQ);
        r=findViewById(R.id.imageButtonR);
        s=findViewById(R.id.imageButtonS);
        t=findViewById(R.id.imageButtonT);
        u=findViewById(R.id.imageButtonU);
        v=findViewById(R.id.imageButtonV);
        w=findViewById(R.id.imageButtonW);
        x=findViewById(R.id.imageButtonX);
        y=findViewById(R.id.imageButtonY);
        z=findViewById(R.id.imageButtonZ);
        
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
    	
    	 // Play only one sound at a time
        if(mp != null) mp.release();

       // Find which ImageButton was pressed and take appropriate action

       switch(v.getId()){

             
             case R.id.imageButtonA:
            	 mp = MediaPlayer.create(this, R.raw.a);
                break;

            
             case R.id.imageButtonB:
            	 mp = MediaPlayer.create(this, R.raw.b);
                break;

             
             case R.id.imageButtonC:
            	 mp = MediaPlayer.create(this, R.raw.c);
                break;
                
             case R.id.imageButtonD:
            	 mp = MediaPlayer.create(this, R.raw.d);
                 break;

             
              case R.id.imageButtonE:
            	  mp = MediaPlayer.create(this, R.raw.e);
                 break;

              
              case R.id.imageButtonF:
            	  mp = MediaPlayer.create(this, R.raw.f);
                 break;
                 
              case R.id.imageButtonG:
            	  mp = MediaPlayer.create(this, R.raw.g);
                  break;

              
               case R.id.imageButtonH:
            	   mp = MediaPlayer.create(this, R.raw.h);
                  break;

               
               case R.id.imageButtonI:
            	   mp = MediaPlayer.create(this, R.raw.i);
                  break;
                  
               case R.id.imageButtonJ:
            	   mp = MediaPlayer.create(this, R.raw.j);
                   break;

               
                case R.id.imageButtonK:
                	mp = MediaPlayer.create(this, R.raw.k);
                   break;

                
                case R.id.imageButtonL:
                	mp = MediaPlayer.create(this, R.raw.l);
                   break;
                   
                case R.id.imageButtonM:
                	mp = MediaPlayer.create(this, R.raw.m);
                    break;

                
                 case R.id.imageButtonN:
                	 mp = MediaPlayer.create(this, R.raw.n);
                    break;

                 
                 case R.id.imageButtonO:
                	 mp = MediaPlayer.create(this, R.raw.o);
                    break;
                    
                 case R.id.imageButtonP:
                	 mp = MediaPlayer.create(this, R.raw.p);
                     break;

                 
                  case R.id.imageButtonQ:
                	  mp = MediaPlayer.create(this, R.raw.q);
                     break;

                  
                  case R.id.imageButtonR:
                	  mp = MediaPlayer.create(this, R.raw.r);
                     break;
                     
                  case R.id.imageButtonS:
                	  mp = MediaPlayer.create(this, R.raw.s);
                      break;

                   
                   case R.id.imageButtonT:
                	   mp = MediaPlayer.create(this, R.raw.t);
                      break;
                      
                   case R.id.imageButtonU:
                	   mp = MediaPlayer.create(this, R.raw.u);
                       break;

                   
                    case R.id.imageButtonV:
                    	mp = MediaPlayer.create(this, R.raw.v);
                       break;

                    
                    case R.id.imageButtonW:
                    	mp = MediaPlayer.create(this, R.raw.w);
                       break;
                       
                    case R.id.imageButtonX:
                    	mp = MediaPlayer.create(this, R.raw.x);
                        break;

                    
                     case R.id.imageButtonY:
                    	 mp = MediaPlayer.create(this, R.raw.y);
                        break;

                     
                     case R.id.imageButtonZ:
                    	 mp = MediaPlayer.create(this, R.raw.z);
                        break;


       }
       mp.seekTo(0);
       mp.start();
    }
    
    @Override
    public void onPause() {
       super.onPause();
       // Release the MediaPlayer if going into background if it isn't null
       if(mp != null) mp.release();
    }

   
    
}
